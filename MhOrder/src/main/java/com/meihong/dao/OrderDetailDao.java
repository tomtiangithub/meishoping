package com.meihong.dao;

import com.meihong.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderDetailDao {
    public int saveOrderDetail(OrderDetail orderDetail);
    public OrderDetail findDetailsByOrderId(int orderId);
}
