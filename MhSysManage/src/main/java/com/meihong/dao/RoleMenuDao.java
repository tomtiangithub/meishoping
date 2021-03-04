package com.meihong.dao;

import com.meihong.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface RoleMenuDao {

    public int saveRoleMenu(RoleMenu roleMenu);
    public int delRoleMenuById(int id);
    public int updateRoleMenuById(RoleMenu roleMenu);
    public RoleMenu findRoleMenuById(int id);
    public List<RoleMenu> findAllRoleMenu();

}
