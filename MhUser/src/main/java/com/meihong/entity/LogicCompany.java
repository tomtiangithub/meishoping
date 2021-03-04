package com.meihong.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "物流公司信息类",description = "物流公司信息类")
public class LogicCompany implements Serializable {

    private String deliveryCompanyCode;
    private String deliveryCompanyName;

}
