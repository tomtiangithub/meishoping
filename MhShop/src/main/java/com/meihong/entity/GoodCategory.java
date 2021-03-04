package com.meihong.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "商品实体类别类",description = "商品类别信息描述类")
public class GoodCategory implements Serializable {
    @ApiModelProperty("商品类别ID")
    private int categoryId;
    @ApiModelProperty("商品类别名")
    private String categoryName;
    @ApiModelProperty("商品类别状态")
    private int categoryStatus;
    @ApiModelProperty("商品父类别ID")
    private int parentCategoryId;
    @ApiModelProperty("商品信息列表")
    private List<GoodInfo> goodInfos;
}
