package com.sgic.ls.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="leaveschema", name="leave")
public class Leave implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7449533126127171977L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String leaveType;
	private float allocationPeriod;
	
	@OneToMany(mappedBy="leave", fetch=FetchType.EAGER, cascade= {CascadeType.ALL})
	private List<LeaveRequest> leaveRequest;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public float getAllocationPeriod() {
		return allocationPeriod;
	}

	public void setAllocationPeriod(float allocationPeriod) {
		this.allocationPeriod = allocationPeriod;
	}

}
