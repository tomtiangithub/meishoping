package com.meihong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private int roleId;
    private String roleName;
    private String roleStatus;
    private String roleRemark;
}
