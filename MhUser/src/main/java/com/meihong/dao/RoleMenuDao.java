package com.meihong.dao;

import com.meihong.entity.RoleMenu;
import com.meihong.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMenuDao {

    public int saveRoleMenu(RoleMenu roleMenu);
    public int delRoleMenuById(int id);
    public int updateRoleMenuById(RoleMenu roleMenu);
    public RoleMenu findRoleMenuById(int id);
    public List<RoleMenu> findAllRoleMenu();


    int insertSelective(RoleMenu record);
    RoleMenu selectByPrimaryKey(int id);
    int updateByPrimaryKeySelective(RoleMenu record);
    int updateByPrimaryKey(RoleMenu record);
    List<RoleMenu> findRoleMenus(@Param(value = "rid") int rid);
    List<RoleMenu> findAll();
    int deleteByRoleId(@Param(value = "rid") int rid);

}
