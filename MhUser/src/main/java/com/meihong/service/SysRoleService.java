package com.meihong.service;

import java.util.List;
import com.meihong.entity.RoleMenu;
import com.meihong.entity.SysMenu;
import com.meihong.entity.SysRole;
import com.meihong.entity.SysRoleMenu;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;

/**
 * 角色管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysRoleService {

	/**
	 * 查询全部
	 * @return
	 */
	List<SysRole> findAll();

	/**
	 * 查询角色菜单集合
	 * @return
	 */
	List<SysMenu> findRoleMenus(Long roleId);
	/**
	 * 保存角色菜单
	 * @param records
	 * @return
	 */
	int saveRoleMenus(List<SysRoleMenu> records);
	List<SysRole> findByName(String name);
	public int save(SysRole record);
	public int delete(SysRole record);
	public int delete(List<SysRole> records);
	public SysRole findById(Long id);
	public PageResult findPage(PageRequest pageRequest);
	SysRole selectByPrimaryKey(Long id);
}