package com.meihong.service.impl;

import com.meihong.dao.GoodCategoryDao;
import com.meihong.entity.GoodInfo;
import com.meihong.service.GoodCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodCategoryServiceImpl implements GoodCategoryService {

    @Resource
    private GoodCategoryDao goodCategoryDao;
    @Override
    public List<GoodInfo> findCategoryAndGooInfoAll() {
        return goodCategoryDao.findCategoryAndGooInfoAll();
    }
}
