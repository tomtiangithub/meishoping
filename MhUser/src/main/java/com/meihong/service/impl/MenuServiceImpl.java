package com.meihong.service.impl;

import com.meihong.dao.MenuDao;
import com.meihong.entity.Menu;
import com.meihong.entity.SysMenu;
import com.meihong.page.MybatisPageHelper;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;
import com.meihong.service.MenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;

    @Override
    public int saveMenu(Menu menu) {
        return menuDao.saveMenu(menu);
        /*if(menu.getMenuId() == null || menu.getMenuId() == 0) {
            return menuDao.insertSelective(menu);
        }
        if(menu.getParentMenuid() == null) {
            menu.setParentMenuid(0L);
        }
        return menuDao.updateByPrimaryKeySelective(menu);*/
    }

    @Override
    public int delMenuById(Menu menu) {
        return menuDao.delMenuById(menu);
    }

    @Override
    public int updateMenuById(Menu menu) {
        return menuDao.updateMenuById(menu);
    }

    @Override
    public Menu findMenuById(int menuId) {
        return menuDao.findMenuById(menuId);
    }

    @Override
    public List<Menu> findAllMenu() {
        return menuDao.findAllMenu();
    }


    @Override
    public int deleteByPrimaryKey(Long id) {
        return menuDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Menu record) {
        return menuDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Menu> findPage() {
        return menuDao.findPage();
    }

     @Override
     public PageResult findPage(PageRequest pageRequest) {
         return MybatisPageHelper.findPage(pageRequest, menuDao);
     }

    @Override
    public List<Menu> findPageByName(String menuName) {
        return menuDao.findPageByName(menuName);
    }

    @Override
    public List<Menu> findByUserName(String memberName) {
        return menuDao.findByUserName(memberName);
    }

    @Override
    public List<Menu> findRoleMenus(int roleId) {
        return menuDao.findRoleMenus(roleId);
    }

   /* private void findChildren(List<Menu> sysMenus, List<Menu> menus, int type) {
        for (Menu menu : sysMenus) {
            List<Menu> children = new ArrayList<>();
            for (Menu menu : menus) {
                if(type == 1 && menu.getType() == 2) {
                    // 如果是获取类型不需要按钮，且菜单类型是按钮的，直接过滤掉
                    continue ;
                }
                if (menu.getMenuId() != null && menu.getMenuId().equals(menu.getParentMenuid())) {
                    menu.setParentName(SysMenu.getName());
                    menu.setLevel(SysMenu.getLevel() + 1);
                    if(!exists(children, menu)) {
                        children.add(menu);
                    }
                }
            }
            menu.setChildren(children);
            children.sort((o1, o2) -> o1.getMenuIndex()compareTo(o2.getMenuIndex()));
            findChildren(children, menus, type);
        }
    }

    private boolean exists(List<SysMenu> sysMenus, SysMenu sysMenu) {
        boolean exist = false;
        for(SysMenu menu:sysMenus) {
            if(menu.getId().equals(sysMenu.getId())) {
                exist = true;
            }
        }
        return exist;
    }
*/

    @Override
    public List<Menu> findTree(String menuName, int type) {

        return null;
    }

    @Override
    public List<Menu> findByUser(String menuName) {

        return menuDao.findByUserName(menuName);

    }
}
