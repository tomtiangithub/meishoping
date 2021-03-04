package com.meihong.dao;

import com.meihong.entity.OrderMaster;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMasterDao {
    public int saveOrderMaster(OrderMaster orderMaster);
    public int selectByOrderId(OrderMaster orderMaster);
    public OrderMaster findOrderById(int orderId);
}
