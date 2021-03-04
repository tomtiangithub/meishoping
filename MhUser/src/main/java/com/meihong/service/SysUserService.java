package com.meihong.service;

import java.util.List;
import java.util.Set;
import com.meihong.entity.SysUser;
import com.meihong.entity.SysUserRole;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;

/**
 * 用户管理
 * @author tch
 * @date Jan 13, 2021
 */
public interface SysUserService{

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userName
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	/*File createUserExcelFile(PageRequest pageRequest);*/

	public int save(SysUser record);
	public int delete(SysUser record);
	public int delete(List<SysUser> records);
	public SysUser findById(Long id);
	public PageResult findPage(PageRequest pageRequest);
}
