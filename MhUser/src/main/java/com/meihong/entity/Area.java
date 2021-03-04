package com.meihong.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "地区信息类",description = "地区信息类")
public class Area implements Serializable {

    private String areaCode;
    private String areaName;
    private String parentAreaCode;

}
