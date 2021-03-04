package com.meihong.service;

import com.meihong.entity.MemberRole;

import java.util.List;

public interface MemberRoleService {

    public int saveMemberRole(MemberRole memberRole);
    public int deleMemberRoleById(int id);
    public int deleteByUserId(int memberId);
    public int  updateMemberRoleById(MemberRole memberRole);
    public MemberRole findMemberRoleById(int id);
    public List<MemberRole> findAllMemberRole();
    List<MemberRole> findUserRoles(int memberId);
}
