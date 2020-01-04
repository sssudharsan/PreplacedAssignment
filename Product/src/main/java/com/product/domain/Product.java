package com.product.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {
	
	
	@Id
	@GeneratedValue
	private Integer productId;
	
	@Column
	private String productDesc;
	
	@Column
	private String productLen;
	
	@Column
	private Integer productHeight;
	
	@Column
	private String productDepth;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductLen() {
		return productLen;
	}

	public void setProductLen(String productLen) {
		this.productLen = productLen;
	}

	public Integer getProductHeight() {
		return productHeight;
	}

	public void setProductHeight(Integer productHeight) {
		this.productHeight = productHeight;
	}

	public String getProductDepth() {
		return productDepth;
	}

	public void setProductDepth(String productDepth) {
		this.productDepth = productDepth;
	}
	
	
	
	

}
