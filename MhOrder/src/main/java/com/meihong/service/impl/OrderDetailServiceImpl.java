package com.meihong.service.impl;

import com.meihong.dao.OrderDetailDao;
import com.meihong.entity.OrderDetail;
import com.meihong.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailDao orderDetailDao;

   @Override
    public int saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailDao.saveOrderDetail(orderDetail);
    }

    @Override
    public OrderDetail findDetailsByOrderId(int orderId){
        return orderDetailDao.findDetailsByOrderId(orderId);
    }
}
