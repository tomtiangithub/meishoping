package com.meihong.service;

import com.meihong.entity.CartInfo;

import java.util.List;

public interface CartInfoService {
    public void addCartInfo(CartInfo cartInfo);
    public int deleteCartInfoById(int goodId);
    public List<CartInfo> findCartAll();
}
