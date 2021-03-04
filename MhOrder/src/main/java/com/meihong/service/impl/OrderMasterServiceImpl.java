package com.meihong.service.impl;

import com.meihong.dao.OrderMasterDao;
import com.meihong.entity.OrderMaster;
import com.meihong.service.OrderMasterService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    @Resource
    private OrderMasterDao orderMasterDao;

   @Override
    public int saveOrderMaster(OrderMaster orderMaster) {
        orderMasterDao.saveOrderMaster(orderMaster);
        int orderId=orderMaster.getOrderId();
        System.out.println("***************9999999999999999***********"+orderId);
        return orderId;
    }

    @Override
    public int selectByOrderId(OrderMaster orderMaster) {
        return orderMasterDao.selectByOrderId(orderMaster);
    }

    @Override
    public OrderMaster findOrderById(int orderId){
       return  orderMasterDao.findOrderById(orderId);
    }
}
