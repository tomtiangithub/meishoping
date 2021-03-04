package com.meihong.entity;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "订单实体类",description = "订单信息描述类")
public class OrderMaster implements Serializable {

    @ApiModelProperty("订单编号")
    private int orderId;
    @ApiModelProperty("会员信息")
    private int memberId;
    @ApiModelProperty("订单类别")
    private String orderType;
    @ApiModelProperty("订单金额")
    private Double orderAmount;
    @ApiModelProperty("订单时间")
    private String orderTime;
    @ApiModelProperty("订单状态")
    private String orderStatus;
    @ApiModelProperty("收货人")
    private String consignee;
    @ApiModelProperty("联系电话")
    private String consigneeNumber;
    @ApiModelProperty("收货地址")
    private String consigneeAddress;
    @ApiModelProperty("竞拍号")
    private String refno;
    @ApiModelProperty("订单送货号")
    private String deliveryNo;
    @ApiModelProperty("订单送时间")
    private String deliveryTime;
    @ApiModelProperty("订单送货公司代码")
    private String deliveryCompanyCode;
    @ApiModelProperty("订单详细信息列表")
    private List<OrderDetail> orderDetails;

}
