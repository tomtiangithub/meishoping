package com.meihong.service.impl;

import com.meihong.constant.SysConstants;
import com.meihong.dao.MenuDao;
import com.meihong.dao.RoleDao;
import com.meihong.dao.RoleMenuDao;
import com.meihong.entity.*;
import com.meihong.page.MybatisPageHelper;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;
import com.meihong.service.RoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;
    @Resource
    private MenuDao menuDao;
    @Resource
    private RoleMenuDao roleMenuDao;

    @Override
    public int saveRole(Role role) {
        return roleDao.saveRole(role);
    }

    @Override
    public int delRoleById(Role role) {
        return roleDao.delRoleById(role);
    }

    @Override
    public int updateRoleById(Role role) {
        return roleDao.updateRoleById(role);
    }

    @Override
    public Role findRoleById(int roleId) {
        return roleDao.findRoleById(roleId);
    }

    @Override
    public List<Role> findAllRole() {
        return roleDao.findAllRole();
    }



    @Override
    public int insertSelective(Role role){
        return roleDao.insertSelective(role);
    }
    @Override
    public int updateByPrimaryKeySelective(Role role){
        return roleDao.updateByPrimaryKeySelective(role);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest){
        Object label = pageRequest.getParam("name");
        if(label != null) {
            return MybatisPageHelper.findPage(pageRequest, roleDao, "findPageByName", label);
        }
        return MybatisPageHelper.findPage(pageRequest, roleDao);

    }
    @Override
    public List<Role> findPageByName(@Param(value = "roleName") String roleName){
        return roleDao.findPageByName(roleName);
    }
    @Override
    public List<Role> findByName(@Param(value = "roleName") String roleName){
        return roleDao.findByName(roleName);
    }

    @Override
    public List<Menu> findRoleMenus(int roleId) {
        Role role =  roleDao.findRoleById(roleId);

        if(SysConstants.ADMIN.equalsIgnoreCase(role.getRoleName())) {
            // 如果是超级管理员，返回全部
            return menuDao.findAllMenu();
        }
        return menuDao.findRoleMenus(roleId);
    }

    @Transactional
    @Override
    public int saveRoleMenus(List<RoleMenu> records) {
        if(records == null || records.isEmpty()) {
            return 1;
        }
        int roleId = records.get(0).getRid();
        roleMenuDao.deleteByRoleId(roleId);

        for(RoleMenu record:records) {
            roleMenuDao.insertSelective(record);
        }
        return 1;
    }
}
