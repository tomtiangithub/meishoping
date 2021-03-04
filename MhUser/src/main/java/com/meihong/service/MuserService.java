package com.meihong.service;

import com.meihong.entity.Muser;
import org.apache.ibatis.annotations.Param;


public interface MuserService {

    public Muser getMuserById(@Param("id") Long id);

}
