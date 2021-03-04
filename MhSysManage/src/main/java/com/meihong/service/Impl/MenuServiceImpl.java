package com.meihong.service.Impl;

import com.meihong.dao.MenuDao;
import com.meihong.entity.Menu;
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
}
