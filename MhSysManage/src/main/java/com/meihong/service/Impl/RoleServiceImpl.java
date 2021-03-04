package com.meihong.service.Impl;

import com.meihong.dao.RoleDao;
import com.meihong.entity.Role;
import com.meihong.service.RoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

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
}
