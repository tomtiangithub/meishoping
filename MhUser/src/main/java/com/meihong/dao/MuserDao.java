package com.meihong.dao;

import com.meihong.entity.Muser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface MuserDao {

    public Muser getMuserById(@Param("id") Long id);

}
