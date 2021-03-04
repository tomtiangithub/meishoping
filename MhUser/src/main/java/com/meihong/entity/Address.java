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
@ApiModel(value = "地址信息类",description = "地址信息类")
public class Address implements Serializable {

    @ApiModelProperty("会员ID")
    private int memberId;
    @ApiModelProperty("地址ID")
    private int addressId ;
    @ApiModelProperty("省份代码")
    private String provinceCode;
    @ApiModelProperty("市区代码")
    private String cityCode;
    @ApiModelProperty("区代码")
    private String countyCode;
    @ApiModelProperty("区域地址")
    private String areaAddress;
    @ApiModelProperty("详细地址")
    private String address;
    @ApiModelProperty("收货人")
    private String consignee;
    @ApiModelProperty("收货人电话")
    private String consigneeNumber;
    @ApiModelProperty("是否缺省")
    private int isDefault;

}
