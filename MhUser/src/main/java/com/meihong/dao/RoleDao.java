package com.meihong.dao;

import com.meihong.entity.Role;
import com.meihong.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleDao {
    public int saveRole(Role role);
    public int delRoleById(Role role);
    public int updateRoleById(Role role);
    public Role findRoleById(int roleId);
    public List<Role> findAllRole();

    public int insertSelective(Role role);
    public int updateByPrimaryKeySelective(Role role);
    public List<Role> findPage();
    public List<Role> findPageByName(@Param(value = "name") String name);
    public List<Role> findByName(@Param(value = "name") String name);

}
