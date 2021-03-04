package com.meihong.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "会员信息类",description = "会员信息类")
public class MemberInfo implements Serializable {
   @ApiModelProperty("会员ID")
    private int memberId;
    @ApiModelProperty("会员电话")
    private String memberPhone;
    @ApiModelProperty("会员密码")
    private String memberPwd;
    @ApiModelProperty("创建时间")
    private String createTime;
    @ApiModelProperty("会员图标")
    private String memberIcon;
    @ApiModelProperty("会员状态")
    private int memberStatus;
    @ApiModelProperty("会员名称")
    private String memberName;
    @ApiModelProperty("会员类型")
    private String memberType;
    @ApiModelProperty("帐号代码")
    private String accountCode;
    @ApiModelProperty("电话省份")
    private String phoneProvince;
    @ApiModelProperty("会员等级")
    private int memberLvl;
    @ApiModelProperty("推荐码")
    private String recommendCode;
    @ApiModelProperty("代理推荐码")
    private String agentreCommendCode;
    @ApiModelProperty("推荐类型")
    private String recommendType;
    @ApiModelProperty("父推荐码")
    private String parentreCommendCode;
    @ApiModelProperty("是否虚拟")
    private String isVirtual;
    @ApiModelProperty("盐值")
    private String salt;
   // 非数据库字段
   private String roleNames;
   // 非数据库字段
   private List<MemberRole> memberRoles = new ArrayList<>();
}
