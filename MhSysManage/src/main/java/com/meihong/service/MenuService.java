package com.meihong.service;

import com.meihong.entity.Menu;
import java.util.List;

public interface MenuService {
    public int saveMenu(Menu menu);
    public int delMenuById(Menu menu);
    public int updateMenuById(Menu menu);
    public Menu findMenuById(int menuId);
    public List<Menu> findAllMenu();
}
