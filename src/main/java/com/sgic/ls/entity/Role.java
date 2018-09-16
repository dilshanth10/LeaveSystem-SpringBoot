package com.sgic.ls.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="leaveschema", name="role")
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4675329358062572646L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(columnDefinition="int(5)")
	private Integer roleId;
	
	@Column(length=20)
	private String roleName;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
