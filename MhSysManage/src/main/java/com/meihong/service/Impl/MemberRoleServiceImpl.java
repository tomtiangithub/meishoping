package com.meihong.service.Impl;

import com.meihong.dao.MemberRoleDao;
import com.meihong.entity.MemberRole;
import com.meihong.service.MemberRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberRoleServiceImpl implements MemberRoleService {

    @Resource
    private MemberRoleDao memberRoleDao;

    @Override
    public int saveMemberRole(MemberRole memberRole) {
        return memberRoleDao.saveMemberRole(memberRole);
    }

    @Override
    public int deleMemberRoleById(int id) {
        return memberRoleDao.deleMemberRoleById(id);
    }

    @Override
    public int updateMemberRoleById(MemberRole memberRole) {
        return memberRoleDao.updateMemberRoleById(memberRole);
    }

    @Override
    public MemberRole findMemberRoleById(int id) {
        return memberRoleDao.findMemberRoleById(id);
    }

    @Override
    public List<MemberRole> findAllMemberRole() {
        return memberRoleDao.findAllMemberRole();
    }
}
