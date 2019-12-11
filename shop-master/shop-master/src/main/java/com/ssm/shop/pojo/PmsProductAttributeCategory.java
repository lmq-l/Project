package com.ssm.shop.pojo;

/**
 * 产品属性分类表
 */
public class PmsProductAttributeCategory extends BaseModel{
    private Long id;

    private String name;

    /**
     * 属性数量
     */
    private Integer attributeCount;

    /**
     * 参数数量
     */
    private Integer paramCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public void setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
    }

    public Integer getParamCount() {
        return paramCount;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
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