package com.meihong.dao;

import com.meihong.entity.MemberRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRoleDao {

    public int saveMemberRole(MemberRole memberRole);
    public int deleMemberRoleById(int id);
    public int deleteByUserId(int memberId);
    public int  updateMemberRoleById(MemberRole memberRole);
    public MemberRole findMemberRoleById(int id);
    public List<MemberRole> findAllMemberRole();

    List<MemberRole> findUserRoles(int memberId);

}
