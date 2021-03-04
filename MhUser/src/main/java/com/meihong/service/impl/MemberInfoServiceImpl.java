package com.meihong.service.impl;

import com.meihong.constant.SysConstants;
import com.meihong.dao.MemberInfoDao;
import com.meihong.dao.MemberRoleDao;
import com.meihong.dao.MenuDao;
import com.meihong.dao.RoleDao;
import com.meihong.entity.*;
import com.meihong.page.MybatisPageHelper;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;
import com.meihong.service.MemberInfoService;
import com.meihong.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Service
public class MemberInfoServiceImpl implements MemberInfoService {

    @Resource
    private MemberInfoDao memberInfoDao;
	@Resource
	private MenuService menuService;
	@Resource
	private MemberRoleDao memberRoleDao;
	@Resource
	private RoleDao roleDao;
    @Resource
    private MenuDao menuDao;

    @Override
    public MemberInfo findMember(String memberName, String memberPwd) {
        return memberInfoDao.findMember(memberName,memberPwd);
    }
    @Override
    public MemberInfo findMemberByName(String memberName){
        return memberInfoDao.findMemberByName(memberName);
    }

    @Override
    public int insertMember(MemberInfo memberInfo) {
         return memberInfoDao.insertMember(memberInfo);
    }


    @Transactional
    @Override
    public int save(MemberInfo record) {
        Integer id = null;
      /*  if(record.getMemberId() == null || record.getMemberId() == 0) {*/
        if(record.getMemberId() == 0) {
            // 新增用户
            memberInfoDao.insertMember(record);
            id = record.getMemberId();
        } else {
            // 更新用户信息
            memberInfoDao.updateByPrimaryKeySelective(record);
        }
        // 更新用户角色
        if(id != null && id == 0) {
            return 1;
        }
        if(id != null) {
            for(MemberRole memberRole:record.getMemberRoles()) {
                memberRole.setMemberId(id);

            }
        } else {
            memberRoleDao.deleteByUserId(record.getMemberId());
        }
        for(MemberRole memberRole:record.getMemberRoles()) {
            memberRoleDao.saveMemberRole(memberRole);
        }
        return 1;
    }

    @Override
    public int delete(MemberInfo record) {
        return memberInfoDao.deleteByPrimaryKey(record.getMemberId());

    }

    @Override
    public int delete(List<MemberInfo> records) {
        for(MemberInfo record:records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public MemberInfo findById(int id) {
        return memberInfoDao.findById(id);
    }

    @Override
    public MemberInfo findByName(String name) {
        return memberInfoDao.findByName(name);
    }

 /*   @Override
    public PageResult findPage(PageRequest pageRequest) {
        PageResult pageResult = null;
        Object name = pageRequest.getParam("name");
        Object email = pageRequest.getParam("email");
        if(name != null) {
            if(email != null) {
                pageResult = MybatisPageHelper.findPage(pageRequest, memberInfoDao, "findPageByNameAndEmail", name, email);
            } else {
                pageResult = MybatisPageHelper.findPage(pageRequest, memberInfoDao, "findPageByName", name);
            }
        } else {
            pageResult = MybatisPageHelper.findPage(pageRequest, memberInfoDao);
        }
        // 加载用户角色信息
        findUserRoles(pageResult);
        return pageResult;
    }*/

    /**
     * 加载用户角色
     * @param pageResult
     */
    private void findUserRoles(PageResult pageResult) {
        List<?> content = pageResult.getContent();
        for(Object object:content) {
            MemberInfo memeberInfo = (MemberInfo) object;
            List<MemberRole> memberRoles = findUserRoles(memeberInfo.getMemberId());
            memeberInfo.setMemberRoles(memberRoles);
            memeberInfo.setRoleNames(getRoleNames(memberRoles));
        }
    }

    private String getRoleNames(List<MemberRole> memberRoles) {
        StringBuilder sb = new StringBuilder();
        for(Iterator<MemberRole> iter = memberRoles.iterator(); iter.hasNext();) {
            MemberRole memberRole = iter.next();
            Role role = roleDao.findRoleById(memberRole.getRoleId());
            if(role == null) {
                continue ;
            }
            sb.append(role.getRoleRemark());
            if(iter.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public Set<String> findPermissions(String userName) {
        Set<String> perms = new HashSet<>();
        List<Menu> menus =  menuService.findByUser(userName);
        for(Menu menu:menus) {
            if(menu.getPerms() != null && !"".equals(menu.getPerms())) {
                perms.add(menu.getPerms());
            }
        }
        return perms;
    }

    @Override
    public List<MemberRole> findUserRoles(int memberId) {
        return memberRoleDao.findUserRoles(memberId);
    }


    @Override
    public List<Menu> findByUser(String memberName) {
        if(memberName == null || "".equals(memberName) || SysConstants.ADMIN.equalsIgnoreCase(memberName)) {
            return menuDao.findAllMenu();

        }
        return menuDao.findByUserName(memberName);
    }
}
