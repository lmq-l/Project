package com.ssm.shop.service.inter;

import java.util.List;
import com.ssm.shop.pojo.SysDict;
import com.ssm.shop.service.CurdService;

/**
 * 字典管理
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 */
	List<SysDict> findByLable(String lable);
}
