package com.meihong.service;

import java.util.List;
import com.meihong.entity.SysDept;
import com.meihong.page.PageRequest;
import com.meihong.page.PageResult;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService {

	/**
	 * 查询机构树
	 * @param
	 * @return
	 */
	List<SysDept> findTree();
	public int save(SysDept record);
	public int delete(SysDept record);
	public int delete(List<SysDept> records);
	public SysDept findById(Long id);
	public PageResult findPage(PageRequest pageRequest);
	public void findChildren(List<SysDept> sysDepts, List<SysDept> depts);

}
