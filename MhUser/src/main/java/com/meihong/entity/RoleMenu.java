package com.meihong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleMenu implements Serializable {
    private int id;
    private int rid;
    private int mid;
}
