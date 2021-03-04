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
@ApiModel(value = "购物车信息类",description = "购物车信息类")
public class CartInfo implements Serializable {
    @ApiModelProperty("商品ID")
    private Long goodId;
    @ApiModelProperty("商品名称")
    private String goodName;
    @ApiModelProperty("单位")
    private String goodUnit;
    @ApiModelProperty("价格")
    private Double goodPrice;
    @ApiModelProperty("商品描述")
    private String goodDescribe;
    @ApiModelProperty("类别ID")
    private Integer categoryId;
    @ApiModelProperty("品牌代码")
    private String brandCode;
    @ApiModelProperty("商品图片")
    private String goodPicture;
    @ApiModelProperty("商品目录")
    private String goodSummary;
    @ApiModelProperty("商品传送")
    private String goodCarousel;
    @ApiModelProperty("商品数量")
    private int goodNum;
}
