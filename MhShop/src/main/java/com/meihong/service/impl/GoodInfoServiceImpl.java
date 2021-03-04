package com.meihong.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meihong.entity.GoodInfo;
import com.meihong.dao.GoodInfoDao;
import com.meihong.service.GoodInfoService;
import com.meihong.util.PageRequest;
import com.meihong.util.PageResult;
import com.meihong.util.PageUtils;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodInfoServiceImpl implements GoodInfoService {
    @Resource
    private GoodInfoDao goodInfoDao;
    @Override
    public List<GoodInfo> findAll() {
        return goodInfoDao.findAll();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    @Override
    public GoodInfo findGoodInfoById(Long goodId) {
        return goodInfoDao.findGoodInfoById(goodId);
    }

    /**
     * 调用分页插件完成分页
     * @param pageRequest
     * @return
     */
    private PageInfo<GoodInfo> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<GoodInfo> goodInfoList =goodInfoDao.findPage();
        return new PageInfo<GoodInfo>(goodInfoList);
    }

    @Override
    public Integer findGoodNumById(@Param("goodId") Long goodId){
        return goodInfoDao.findGoodNumById(goodId);
    }
}
