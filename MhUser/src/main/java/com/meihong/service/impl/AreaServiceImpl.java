package com.meihong.service.impl;

import com.meihong.entity.Area;
import com.meihong.service.AreaService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaService areaService;

    @Override
    public int saveArea(Area area) {
        return areaService.saveArea(area);
    }

    @Override
    public int delAreaById(String areacode) {
        return areaService.delAreaById(areacode);
    }

    @Override
    public int updateAreaById(Area area) {
        return areaService.updateAreaById(area);
    }

    @Override
    public Area findAreaById(String areacode){
        return  areaService.findAreaById(areacode);
    }
    @Override
    public List<Area> findAllArea() {
        return areaService.findAllArea();
    }
}
