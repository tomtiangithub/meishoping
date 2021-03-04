package com.meihong.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "订单详情类",description = "订单详情描述类")
public class OrderDetail implements Serializable {

    @ApiModelProperty("订单编号")
    private int orderId;
    @ApiModelProperty("商品ID")
    private int goodId;
    @ApiModelProperty("商品名称")
    private String goodName;
    @ApiModelProperty("商品单位")
    private String goodUnit;
    @ApiModelProperty("订单数量")
    private Double saleCount;
    @ApiModelProperty("销售单价")
    private Double salePrice;
    @ApiModelProperty("合计")
    private Double saleAmount;
    @ApiModelProperty("商品图片")
    private String goodPicture;
    @ApiModelProperty("商品描述")
    private String goodDescribe;
}
