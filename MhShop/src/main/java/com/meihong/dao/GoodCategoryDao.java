package com.meihong.dao;

import com.meihong.entity.GoodInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodCategoryDao {

    public List<GoodInfo> findCategoryAndGooInfoAll();
}
