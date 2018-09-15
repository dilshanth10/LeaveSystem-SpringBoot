package com.sgic.ls.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class LeaveDayId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4085851078571952950L;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Leave type;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Leave getType() {
		return type;
	}

	public void setType(Leave type) {
		this.type = type;
	}
	

}
