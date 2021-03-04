package com.meihong.service;

import com.meihong.entity.OrderDetail;

public interface OrderDetailService {
    public int saveOrderDetail(OrderDetail orderDetail);
    public OrderDetail findDetailsByOrderId(int orderId);
}
