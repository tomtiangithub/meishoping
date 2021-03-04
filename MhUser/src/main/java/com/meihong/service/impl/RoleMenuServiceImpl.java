package com.meihong.service.impl;

import com.meihong.dao.RoleMenuDao;
import com.meihong.entity.RoleMenu;
import com.meihong.service.RoleMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Resource
    private RoleMenuDao roleMenuDao;

    @Override
    public int saveRoleMenu(RoleMenu roleMenu) {
        return roleMenuDao.saveRoleMenu(roleMenu);
    }

    @Override
    public int delRoleMenuById(int id) {
        return roleMenuDao.delRoleMenuById(id);
    }

    @Override
    public int updateRoleMenuById(RoleMenu roleMenu) {
        return roleMenuDao.updateRoleMenuById(roleMenu);
    }

    @Override
    public RoleMenu findRoleMenuById(int id) {
        return roleMenuDao.findRoleMenuById(id);
    }

    @Override
    public List<RoleMenu> findAllRoleMenu() {
        return roleMenuDao.findAllRoleMenu();
    }

    @Override
    public int insertSelective(RoleMenu record) {
        return roleMenuDao.insertSelective(record);
    }

    @Override
    public RoleMenu selectByPrimaryKey(int id) {
        return roleMenuDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleMenu record) {
        return roleMenuDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleMenu record) {
        return roleMenuDao.updateByPrimaryKey(record);
    }

    @Override
    public List<RoleMenu> findRoleMenus(int rid) {
        return roleMenuDao.findRoleMenus(rid);
    }

    @Override
    public List<RoleMenu> findAll() {
        return roleMenuDao.findAll();
    }

    @Override
    public int deleteByRoleId(int rid) {
        return roleMenuDao.deleteByRoleId(rid);
    }
}
