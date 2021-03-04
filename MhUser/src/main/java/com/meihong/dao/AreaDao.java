package com.meihong.dao;

import com.meihong.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaDao {

    public int saveArea(Area area);
    public int delAreaById(String areacode);
    public int updateAreaById(Area area);
    public Area findAreaById(String areacode);
    public List<Area> findAllArea();

}
