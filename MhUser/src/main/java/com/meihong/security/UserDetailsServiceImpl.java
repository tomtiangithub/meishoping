package com.meihong.security;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.meihong.entity.MemberInfo;
import com.meihong.entity.SysUser;
import com.meihong.service.MemberInfoService;
import com.meihong.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 用户登录认证信息查询
 * @author tch
 * @date Jan 14, 2021
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    /*@Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserService.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        // 用户权限列表，根据用户拥有的权限标识与如 @PreAuthorize("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
        Set<String> permissions = sysUserService.findPermissions(user.getName());
        List<GrantedAuthority> grantedAuthorities = permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
        return new JwtUserDetails(user.getName(), user.getPassword(), user.getSalt(), grantedAuthorities);
    }*/

    @Autowired
    //private SysUserService sysUserService;
    private MemberInfoService memberInfoService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      // SysUser user = sysUserService.findByName(username);
        MemberInfo user = memberInfoService.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        // 用户权限列表，根据用户拥有的权限标识与如 @PreAuthorize("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
      //  Set<String> permissions = sysUserService.findPermissions(user.getName());
        Set<String> permissions =  memberInfoService.findPermissions(user.getMemberName());

        List<GrantedAuthority> grantedAuthorities = permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
       // return new JwtUserDetails(user.getName(), user.getPassword(), user.getSalt(), grantedAuthorities);
         return new JwtUserDetails(user.getMemberName(), user.getMemberPwd(), user.getSalt(), grantedAuthorities);
    }

}