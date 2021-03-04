package com.meihong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberRole implements Serializable {
    private int id;
    private int memberId;
    private int roleId;
}
