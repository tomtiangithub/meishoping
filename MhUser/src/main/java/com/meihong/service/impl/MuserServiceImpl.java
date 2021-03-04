package com.meihong.service.impl;

import com.meihong.dao.MuserDao;
import com.meihong.entity.Muser;
import com.meihong.service.MuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class MuserServiceImpl implements MuserService {

    @Resource
    private MuserDao muserdao;

    @Override
    public Muser getMuserById(Long id){

        return muserdao.getMuserById(id);

    }

}