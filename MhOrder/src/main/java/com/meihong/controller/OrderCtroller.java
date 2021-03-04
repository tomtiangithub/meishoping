package com.meihong.controller;

import com.meihong.entity.CartInfo;
import com.meihong.entity.CommonResult;
import com.meihong.entity.OrderDetail;
import com.meihong.entity.OrderMaster;
import com.meihong.service.CartInfoService;
import com.meihong.service.OrderDetailService;
import com.meihong.service.OrderMasterService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
/*@RequestMapping("order")*/
@Slf4j
@Api(tags = "订单数据接口")
public class OrderCtroller {

    @Resource
    private OrderDetailService orderDetailService;
    @Resource
    private OrderMasterService orderMasterService;
    @Resource
    private CartInfoService cartInfoService;

   @PostMapping(value="/order/saveOrderMaster")
    public int saveOrderMaster(@RequestBody OrderMaster orderMaster){
       System.out.println("88888888888888 orderMaster is:"+orderMaster);
       int orderId=orderMasterService.saveOrderMaster(orderMaster);
       List<OrderDetail> orderDetails=orderMaster.getOrderDetails();
       for(int i=0;i<orderDetails.size();i++){
           OrderDetail orderDetail=new OrderDetail();
           orderDetail.setOrderId(orderId);
           orderDetail.setGoodId(orderDetails.get(i).getGoodId());
           orderDetail.setGoodName(orderDetails.get(i).getGoodName());
           orderDetail.setGoodUnit(orderDetails.get(i).getGoodUnit());
           orderDetail.setSalePrice(orderDetails.get(i).getSalePrice());
           orderDetail.setSaleCount(orderDetails.get(i).getSaleCount());
           orderDetail.setSaleAmount(orderDetails.get(i).getSaleAmount());
           orderDetail.setGoodDescribe(orderDetails.get(i).getGoodDescribe());
           orderDetailService.saveOrderDetail(orderDetail);
       }
       return orderId;
    }

    @PostMapping(value = "/order/findIdByOrderMaster")
    public int selectByOrderId(@RequestBody OrderMaster orderMaster){

       return orderMasterService.selectByOrderId(orderMaster);
    }

    @PostMapping(value="/order/saveOrderDetail")
    public int saveOrderDetail(@RequestBody OrderDetail orderDetail){
       return orderDetailService.saveOrderDetail(orderDetail);
    }

   @GetMapping(value="/order/findOrderById/{orderId}")
   public OrderMaster findOrderById(@PathVariable("orderId") int orderId){
       System.out.println("33333333orderId is: "+orderId);
       OrderMaster orderMaster=orderMasterService.findOrderById(orderId);
       return orderMaster;

   }

    @GetMapping(value="/order/findDetailsByOrderId/{orderId}")
    public CommonResult<OrderDetail> findDetailsByOrderId(@PathVariable("orderId") Integer orderId){

        OrderDetail orderDetail=orderDetailService.findDetailsByOrderId(orderId);
        if(orderDetail != null){
            return new CommonResult(200,"查询成功,serverPort:  ", orderDetail);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    /*******************************cartinof start*******************************/
    @PostMapping(value="/cart/addCart")
    public void addCartInfo(@RequestBody CartInfo cartInfo){
        System.out.println("cartInfo is: "+cartInfo);
        cartInfoService.addCartInfo(cartInfo);
    }

    @GetMapping(value="/cart/deleteCartInfo/{goodId}")
    public CommonResult<Integer> deleteCartInfoById(@PathVariable("goodId")int goodId){
        Integer total= cartInfoService.deleteCartInfoById(goodId);
        if(total != null){
            return new CommonResult(200,"查询成功,serverPort:  ", total);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }

    @GetMapping(value="/cart/findCartInfoAll")
    public CommonResult<List<CartInfo>> findCartAll(){
       List<CartInfo> cartinfos=cartInfoService.findCartAll();
        if(cartinfos != null){
            return new CommonResult(200,"查询成功,serverPort:  ", cartinfos);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: ",null);
        }
    }
    /*******************************cartinof ene*******************************/

}
