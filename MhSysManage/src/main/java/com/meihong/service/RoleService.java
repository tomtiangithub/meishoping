package com.meihong.service;

import com.meihong.entity.Role;

import java.util.List;

public interface RoleService {
    public int saveRole(Role role);
    public int delRoleById(Role role);
    public int updateRoleById(Role role);
    public Role findRoleById(int roleId);
    public List<Role> findAllRole();
}
