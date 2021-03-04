package com.meihong.service;

import com.meihong.entity.Menu;
import com.meihong.entity.SysMenu;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {

    /**
     * 查询菜单树,用户ID和用户名为空则查询全部
     * @param type 获取菜单类型，0：获取所有菜单，包含按钮，1：获取所有菜单，不包含按钮
     * @param
     * @return
     */
    List<Menu> findTree(String menuName, int type);

    /**
     * 根据用户名查找菜单列表
     * @param memberName
     * @return
     */
    List<Menu> findByUser(String memberName);
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

    public PageResult findPage(PageRequest pageRequest);

}
