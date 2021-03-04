package com.meihong.dao;

import com.meihong.entity.Menu;
import com.meihong.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface MenuDao {
    public int saveMenu(Menu menu);
    public int delMenuById(Menu menu);
    public int updateMenuById(Menu menu);
    public Menu findMenuById(int menuId);
    public List<Menu> findAllMenu();

    int deleteByPrimaryKey(Long id);
    int insertSelective(Menu record);
    int updateByPrimaryKeySelective(Menu record);
    List<Menu> findPage();
    List<Menu> findPageByName(@Param(value = "menuName") String menuName);
    List<Menu> findByUserName(@Param(value = "memberName") String memberName);
    List<Menu> findRoleMenus(@Param(value = "roleId") int roleId);

}
