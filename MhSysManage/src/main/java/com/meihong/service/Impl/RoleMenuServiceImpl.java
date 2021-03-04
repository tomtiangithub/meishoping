package com.meihong.service.Impl;

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
}
