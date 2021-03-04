package com.meihong.service;

import com.meihong.entity.OrderMaster;

public interface OrderMasterService {
    public int saveOrderMaster(OrderMaster orderMaster);
    public int selectByOrderId(OrderMaster orderMaster);
    public OrderMaster findOrderById(int orderId);

}
