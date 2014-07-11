package com.zh.core.model;
/**
 * 数据对象接口
 * @author Flouny.Caesar
 *
 */
public abstract class IDataObject {

	private String orderByClause;

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
	
}