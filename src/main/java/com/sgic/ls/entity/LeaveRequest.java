package com.sgic.ls.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(schema="leaveschema", name="leave_request")
public class LeaveRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6491956105638932995L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="leave_id")
	private Leave leave;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name="leave_status_id")
	private LeaveStatus leaveStatus;
	
	private ZonedDateTime fromTime;
	private ZonedDateTime toTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@JsonIgnore
	public Leave getLeave() {
		return leave;
	}
	public void setLeave(Leave leave) {
		this.leave = leave;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public ZonedDateTime getFromTime() {
		return fromTime;
	}
	public void setFromTime(ZonedDateTime fromTime) {
		this.fromTime = fromTime;
	}
	public ZonedDateTime getToTime() {
		return toTime;
	}
	public void setToTime(ZonedDateTime toTime) {
		this.toTime = toTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
