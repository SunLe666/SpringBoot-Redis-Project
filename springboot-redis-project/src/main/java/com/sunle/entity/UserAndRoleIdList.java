package com.sunle.entity;

import java.io.Serializable;

/**
 * 
 * 用户和角色的关系
 * 
 * */
public class UserAndRoleIdList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer userId;

	private Integer roleId;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
