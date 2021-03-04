package com.meihong.service.impl;

import com.meihong.dao.CartInfoDao;
import com.meihong.entity.CartInfo;
import com.meihong.service.CartInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartInfoServiceImpl implements CartInfoService {

    @Resource
    private CartInfoDao cartInfoDao;

    @Override
    public void addCartInfo(CartInfo cartInfo) {
         cartInfoDao.addCartInfo(cartInfo);
    }

    @Override
    public int deleteCartInfoById(int goodId) {
        return cartInfoDao.deleteCartInfoById(goodId);
    }

    @Override
    public List<CartInfo> findCartAll() {
        return cartInfoDao.findCartAll();
    }
}
