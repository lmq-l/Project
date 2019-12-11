package com.ssm.shop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ssm.shop.dao.SysDeptMapper;
import com.ssm.shop.page.MybatisPageHelper;
import com.ssm.shop.page.PageRequest;
import com.ssm.shop.page.PageResult;
import com.ssm.shop.pojo.SysDept;
import com.ssm.shop.service.inter.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDeptServiceImpl implements SysDeptService {

	@Autowired
	private SysDeptMapper sysDeptMapper;

	@Override
	public int save(SysDept record) {
		if(record.getId() == null || record.getId()==0) {
			return sysDeptMapper.insertSelective(record);
		}
		return sysDeptMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysDept record) {
		return sysDeptMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysDept> records) {
		for(SysDept record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public SysDept findById(Long id) {
		return sysDeptMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, sysDeptMapper);
	}

	@Override
	public PageResult findTree(SysDept record) {
		List<SysDept> sysDepts = new ArrayList<>();
		int total=sysDeptMapper.selectCount(record);
		record.setCurrentPage((record.getCurrentPage()-1)*record.getPageSize());
		List<SysDept> depts = sysDeptMapper.findAll(record);
		for (SysDept dept : depts) {
			if (dept.getParentId() == null || dept.getParentId() == 0) {
				dept.setLevel(0);
				sysDepts.add(dept);
			}
		}
		findChildren(sysDepts, depts);
		return new PageResult(record.getCurrentPage()+1,record.getPageSize(),total,sysDepts);
	}

	@Override
	public PageResult findAll(SysDept record) {
		int total=sysDeptMapper.selectCount(record);
		record.setCurrentPage((record.getCurrentPage()-1)*record.getPageSize());
		List<SysDept> rows = sysDeptMapper.findAll(record);
		return new PageResult(record.getCurrentPage(),record.getPageSize(),total,rows);
	}

	@Override
	public int selectCount(SysDept record) {
		return 0;
	}

	private void findChildren(List<SysDept> sysDepts, List<SysDept> depts) {
		for (SysDept sysDept : sysDepts) {
			List<SysDept> children = new ArrayList<>();
			for (SysDept dept : depts) {
				if (sysDept.getId() != null && sysDept.getId().equals(dept.getParentId())) {
					dept.setParentName(dept.getName());
					dept.setLevel(sysDept.getLevel() + 1);
					children.add(dept);
				}
			}
			sysDept.setChildren(children);
			findChildren(children, depts);
		}
	}

}
