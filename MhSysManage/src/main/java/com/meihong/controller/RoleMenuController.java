package com.meihong.controller;

import com.meihong.entity.RoleMenu;
import com.meihong.service.RoleMenuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "角色菜单数据接口")
@RestController
@RequestMapping("mhroleMenu")
public class RoleMenuController {

    @Resource
    private RoleMenuService roleMenuService;

    @PostMapping(value="/saveRoleMenu")
    public int saveRoleMenu(@RequestBody RoleMenu roleMenu) {
        return roleMenuService.saveRoleMenu(roleMenu);
    }

    @GetMapping(value="/delete")
    public int delRoleMenuById(@RequestParam int id) {
        return roleMenuService.delRoleMenuById(id);
    }

    @PostMapping(value="/update")
    public int updateRoleMenuById(@RequestBody RoleMenu roleMenu) {
        return roleMenuService.updateRoleMenuById(roleMenu);
    }

    @GetMapping(value="/findRoleMenuById")
    public RoleMenu findRoleMenuById(@RequestParam int id) {
        return roleMenuService.findRoleMenuById(id);
    }

    @GetMapping(value="/findAll")
    public List<RoleMenu> findAllRoleMenu() {
        return roleMenuService.findAllRoleMenu();
    }

}
