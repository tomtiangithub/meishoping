package com.meihong.service;

import com.meihong.entity.Area;

import java.util.List;

public interface AreaService {

    public int saveArea(Area area);
    public int delAreaById(String areacode);
    public int updateAreaById(Area area);
    public Area findAreaById(String areacode);
    public List<Area> findAllArea();
}
