package com.ssm.shop.service.inter;

import java.util.List;

import com.ssm.shop.pojo.SysMenu;
import com.ssm.shop.service.CurdService;

/**
 * 菜单管理
 */
 public interface SysMenuService extends CurdService<SysMenu> {

	/**
	 * 查询菜单树,用户ID和用户名为空则查询全部
	 */
	List<SysMenu> findTree(String userName, int menuType);

	/**
	 * 根据用户名查找菜单列表
	 */
	List<SysMenu> findByUser(String userName);
}
