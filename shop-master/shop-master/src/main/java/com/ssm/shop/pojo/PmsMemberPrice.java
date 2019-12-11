package com.ssm.shop.pojo;

import java.math.BigDecimal;

/**
 * 商品会员价格表
 */
public class PmsMemberPrice extends BaseModel{
    private Long id;

    private Long productId;

    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    private String memberLevelName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
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