package com.meihong.service;

import com.meihong.entity.*;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {

    /**
     * 查询角色菜单集合
     * @return
     */
    public List<Menu> findRoleMenus(int roleId);

    /**
     * 保存角色菜单
     * @param records
     * @return
     */
    public int saveRoleMenus(List<RoleMenu> records);



    public int saveRole(Role role);
    public int delRoleById(Role role);
    public int updateRoleById(Role role);
    public Role findRoleById(int roleId);
    public List<Role> findAllRole();

    public int insertSelective(Role role);
    public int updateByPrimaryKeySelective(Role role);
    public PageResult findPage(PageRequest pageRequest);
    public List<Role> findPageByName(@Param(value = "name") String name);
    public List<Role> findByName(@Param(value = "name") String name);
}
