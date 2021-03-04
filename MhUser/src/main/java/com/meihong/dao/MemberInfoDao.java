package com.meihong.dao;

import com.meihong.entity.MemberInfo;
import com.meihong.entity.MemberRole;
import com.meihong.entity.Menu;
import com.meihong.entity.SysUser;
import com.meihong.page.PageResult;
import com.meihong.utils.page.PageRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

@Mapper
public interface MemberInfoDao {
    public MemberInfo findMember(String memberName, String memberPwd);
    public MemberInfo findMemberByName(String memberName);
    public int insertMember(MemberInfo memberInfo);

    public int save(MemberInfo memberInfo);
    public int updateByPrimaryKeySelective(MemberInfo memberInfo);
    public int updateByPrimaryKey(MemberInfo memberInfo);


    MemberInfo findByName(String memberName);
    public MemberInfo findById(int memberId);
    public PageResult findPage(PageRequest pageRequest);

    public int delete(MemberInfo record);
    public int delete(List<MemberInfo> records);
    public int deleteByPrimaryKey(Integer memberId);
    public List<Menu> findByUser(String memberName);



}
