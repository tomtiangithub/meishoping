package com.meihong.controller;

import com.meihong.constant.SysConstants;
import com.meihong.entity.CommonResult;
import com.meihong.entity.MemberInfo;
import com.meihong.entity.Muser;
import com.meihong.http.HttpResult;
import com.meihong.service.MemberInfoService;
import com.meihong.service.MuserService;
import com.meihong.utils.PasswordUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/*@RequestMapping("muser")*/
@RestController
@Slf4j
@Api(tags = "用户数据接口")
public class MuserController {
    @Resource
    private MuserService muserService;
    @Resource
    private MemberInfoService MemberInfoService;
   /* @Autowired*/
   /* @Resource
    private AuthenticationManager authenticationManager;*/

/*    @PostMapping(value="/muser/save2")
    public CommonResult<Integer>  insertMember(@RequestBody MemberInfo memberInfo){
       int count= MemberInfoService.insertMember(memberInfo);
       Integer record= Integer.valueOf(count);

        if(record != null)
        {
            return new CommonResult(200,"成功,serverPort:  ", record);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }

    }*/

    @GetMapping(value = "/muser/get/{id}")
    public CommonResult<Muser> getMuserById(@PathVariable("id") Long id) {
        Muser muser=muserService.getMuserById(id);

        if(muser != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", muser);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @GetMapping(value = "/member/getMemberByName/{membername}")
    public CommonResult<Muser> getMuserById(@PathVariable("membername") String membername) {
        MemberInfo member=MemberInfoService.findMemberByName(membername);
        if(member != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ", member);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @PostMapping(value = "/member/findMemberInfo")
    public CommonResult<MemberInfo> findMember(@Param("memberName") String memberName, @Param("memberPwd") String memberPwd) {
        MemberInfo memberInfo = MemberInfoService.findMember(memberName, memberPwd);
        if (memberInfo != null) {
            return new CommonResult(200, "查询成功,serverPort:  ", memberInfo);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: ", null);
        }
    }

/*    @PreAuthorize("hasAuthority('sys:user:add') AND hasAuthority('sys:user:edit')")*/
    @PostMapping(value="/muser/save")
    public HttpResult save(@RequestBody MemberInfo memberInfo) throws  Exception{
        MemberInfo member = MemberInfoService.findById(memberInfo.getMemberId());
        if(member != null) {
            if(SysConstants.ADMIN.equalsIgnoreCase(member.getMemberName())) {
                return HttpResult.error("超级管理员不允许修改!");
            }
        }
        if(memberInfo.getMemberPwd() != null) {
            String salt = PasswordUtils.getSalt();
            if(member == null) {
                // 新增用户
                if(MemberInfoService.findByName(memberInfo.getMemberName()) != null) {
                    return HttpResult.error("用户名已存在!");
                }
                String password = PasswordUtils.encode(memberInfo.getMemberPwd(), salt);
                memberInfo.setSalt(salt);
                memberInfo.setMemberPwd(password);
            } else {
                // 修改用户, 且修改了密码
                if(!memberInfo.getMemberPwd().equals(member.getMemberPwd())) {
                    String password = PasswordUtils.encode(memberInfo.getMemberPwd(), salt);
                    memberInfo.setSalt(salt);
                    memberInfo.setMemberPwd(password);
                }
            }
        }
        return HttpResult.ok(MemberInfoService.save(memberInfo));

    }

}
