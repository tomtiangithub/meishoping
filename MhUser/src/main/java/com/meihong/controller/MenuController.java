package com.meihong.controller;

import com.meihong.entity.Menu;
import com.meihong.service.MenuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@Api(tags = "菜单数据接口")
@RestController
@RequestMapping("mhmenu")
public class MenuController {

    @Resource
    private MenuService menuService;

    @PostMapping(value="/saveMenu")
    public int saveMenu(@RequestBody Menu menu) {
        return menuService.saveMenu(menu);
    }

    @PostMapping(value="/delMenuById")
    public int delMenuById(@RequestBody Menu menu) {
        return menuService.delMenuById(menu);
    }

    @PostMapping(value="/updateMenuById")
    public int updateMenuById(@RequestBody Menu menu) {
        return menuService.updateMenuById(menu);
    }

    @GetMapping(value="/findMenuById")
    public Menu findMenuById(@RequestParam int menuId) {
        return menuService.findMenuById(menuId);
    }

    @GetMapping(value="/findAllMenu")
    public List<Menu> findAllMenu() {
        return menuService.findAllMenu();
    }

}
