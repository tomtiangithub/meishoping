package com.meihong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {

    private int menuId;
    private String menuName;
    private String menuUrl;
    private String menuStatus;
    private int parentMenuid;
    private int menuIndex;
    private String perms;
    private int type;
    private String icon;

}
