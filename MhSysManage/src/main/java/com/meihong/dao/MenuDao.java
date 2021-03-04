package com.meihong.dao;

import com.meihong.entity.Menu;
import com.meihong.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface MenuDao {
    public int saveMenu(Menu menu);
    public int delMenuById(Menu menu);
    public int updateMenuById(Menu menu);
    public Menu findMenuById(int menuId);
    public List<Menu> findAllMenu();
}
