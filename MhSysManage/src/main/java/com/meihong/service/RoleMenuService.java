package com.meihong.service;

import com.meihong.entity.RoleMenu;

import java.util.List;

public interface RoleMenuService {

    public int saveRoleMenu(RoleMenu roleMenu);
    public int delRoleMenuById(int id);
    public int updateRoleMenuById(RoleMenu roleMenu);
    public RoleMenu findRoleMenuById(int id);
    public List<RoleMenu> findAllRoleMenu();
}
