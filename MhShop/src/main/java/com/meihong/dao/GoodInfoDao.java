package com.meihong.dao;

import com.meihong.entity.GoodInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface GoodInfoDao {

    public List<GoodInfo> findAll();
    public List<GoodInfo> findPage();
    public GoodInfo findGoodInfoById(@Param("goodId") Long goodId);
    public Integer findGoodNumById(@Param("goodId") Long goodId);

}
