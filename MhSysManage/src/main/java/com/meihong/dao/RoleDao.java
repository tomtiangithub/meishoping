package com.meihong.dao;

import com.meihong.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    public int saveRole(Role role);
    public int delRoleById(Role role);
    public int updateRoleById(Role role);
    public Role findRoleById(int roleId);
    public List<Role> findAllRole();
}
