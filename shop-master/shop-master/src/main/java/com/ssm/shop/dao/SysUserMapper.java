package com.ssm.shop.dao;

import java.util.List;

import com.ssm.shop.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> findPages(SysUser user);

    int selectCount(SysUser user);
    
    SysUser findByName(@Param(value = "name") String name);
    
	List<SysUser> findPageByName(@Param(value = "name") String name);
	
	List<SysUser> findPageByNameAndEmail(@Param(value = "name") String name, @Param(value = "email") String email);
}