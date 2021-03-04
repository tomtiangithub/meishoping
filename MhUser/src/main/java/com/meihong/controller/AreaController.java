package com.meihong.controller;

import com.meihong.entity.Area;
import com.meihong.service.AreaService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Api(tags = "地区数据接口")
@RestController
@RequestMapping("area")
public class AreaController {

    @Resource
    private AreaService areaService;

    @PostMapping(value="/saveArea")
    public int saveArea(@RequestBody Area area){
        return areaService.saveArea(area);
    }
    @GetMapping(value="/delAreaById")
    public int delAreaById(@RequestParam String areacode){
        return areaService.delAreaById(areacode);
    }
    @PostMapping(value="/updateAreaById")
    public int updateAreaById(@RequestBody Area area){
        return areaService.updateAreaById(area);
    }
    @GetMapping(value="/findAreaById")
    public Area findAreaById(String areacode){
        return  areaService.findAreaById(areacode);
    }
    @GetMapping(value="/findAllArea")
    public List<Area> findAllArea(){
        return areaService.findAllArea();
    }

}
