package com.ssm.shop.pojo;

import java.util.List;

public class SysDept extends BaseModel {

    public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	private String name;
    
    private Long parentId;
    private Long Id;
    private Integer orderNum;

    private Byte delFlag;
    
    private List<SysDept> children;
    
    // 非数据库字段
    private String parentName;
    // 非数据库字段
    private Integer level;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Byte getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(Byte delFlag) {
		this.delFlag = delFlag;
	}
	public List<SysDept> getChildren() {
		return children;
	}
	public void setChildren(List<SysDept> children) {
		this.children = children;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public int getCurrentPage() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCurrentPage(int i) {
		// TODO Auto-generated method stub
		
	}


}