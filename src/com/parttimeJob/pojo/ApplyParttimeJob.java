/**
 * 
 */
package com.parttimeJob.pojo;

import java.util.Date;

/**
 * @author simin
 *
 */
public class ApplyParttimeJob {
	private Long applyId;
	private String userId;
	private String ptId;
	private Date applyTime;
	private String note;
	private Character applyStatus;
	
	public String getPtId() {
		return ptId;
	}
	public void setPtId(String ptId) {
		this.ptId = ptId;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Long getApplyID() {
		return applyId;
	}
	public void setApplyID(Long applyID) {
		this.applyId = applyID;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Character getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(Character applyStatus) {
		this.applyStatus = applyStatus;
	}
	
	

}
