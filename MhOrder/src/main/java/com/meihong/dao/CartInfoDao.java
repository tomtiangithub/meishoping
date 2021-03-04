package com.meihong.dao;

import com.meihong.entity.CartInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartInfoDao {
    public void addCartInfo(CartInfo cartInfo);
    public int deleteCartInfoById(int goodId);
    public List<CartInfo> findCartAll();

}
