package com.meihong.controller;


import com.meihong.entity.Role;
import com.meihong.service.RoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "角色数据接口")
@RestController
@RequestMapping("mhrole")
public class RoleController {

    @Resource
    private RoleService roleService;

    @PostMapping(value="/saveRole")
    public int saveRole(@RequestBody Role role){
       return roleService.saveRole(role);
    }

    @PostMapping(value="/delete")
    public int delRoleById(@RequestBody Role role){
       return roleService.delRoleById(role);
    }

    @PostMapping(value="/update")
    public int updateRoleById(@RequestBody Role role){
       return roleService.updateRoleById(role);
    }

    @GetMapping(value="/findRoleById")
    public Role findRoleById(@RequestParam int roleId){
        return roleService.findRoleById(roleId);
    }

    @GetMapping(value="/findAllRole")
    public List<Role> findAllRole(){
        return roleService.findAllRole();
    }

}
