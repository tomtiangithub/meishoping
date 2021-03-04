package com.meihong.service;

import com.meihong.entity.MemberInfo;
import com.meihong.entity.MemberRole;
import com.meihong.entity.Menu;
import java.util.List;
import java.util.Set;

public interface MemberInfoService {
    public MemberInfo findMember(String memberName, String memberPwd);
    public MemberInfo findMemberByName(String memberName);
    public int insertMember(MemberInfo memberInfo);
    public int save(MemberInfo memberInfo);


    MemberInfo findByName(String memberName);
    public MemberInfo findById(int memberId);
  /*  public PageResult findPage(PageRequest pageRequest);*/
    public int delete(MemberInfo record);
    public int delete(List<MemberInfo> records);

    public List<MemberRole> findUserRoles(int memberId);
    public Set<String> findPermissions(String userName);
    public List<Menu> findByUser(String memberName);



}
