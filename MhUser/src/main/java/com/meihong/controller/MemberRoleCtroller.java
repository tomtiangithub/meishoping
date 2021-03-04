package com.meihong.controller;

import com.meihong.entity.MemberRole;
import com.meihong.service.MemberRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "会员角色数据接口")
@RestController
@RequestMapping("memberRole")
public class MemberRoleCtroller {

    @Resource
    private MemberRoleService memberRoleService;

    @PostMapping(value="/save")
    public int saveMemberRole(@RequestBody MemberRole memberRole) {
        return memberRoleService.saveMemberRole(memberRole);
    }

    @GetMapping(value="/delete")
    public int deleMemberRoleById(@RequestParam int id) {
        return memberRoleService.deleMemberRoleById(id);
    }

    @PostMapping(value="/update")
    public int updateMemberRoleById(@RequestBody MemberRole memberRole) {
        return memberRoleService.updateMemberRoleById(memberRole);
    }

    @GetMapping(value="/findById")
    public MemberRole findMemberRoleById(@RequestParam int id) {
        return memberRoleService.findMemberRoleById(id);
    }

    @GetMapping(value="/findAll")
    public List<MemberRole> findAllMemberRole() {
        return memberRoleService.findAllMemberRole();
    }

}
