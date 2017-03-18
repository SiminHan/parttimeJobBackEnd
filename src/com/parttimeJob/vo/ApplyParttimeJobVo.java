package com.parttimeJob.vo;

import java.util.Date;

public class ApplyParttimeJobVo {
	private Long applyId;
	private Long userId;
	private Long ptId;
	private Date applyTime;
	private String note;
	private Character applyStatus;
	public Long getApplyId() {
		return applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPtId() {
		return ptId;
	}
	public void setPtId(Long ptId) {
		this.ptId = ptId;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Character getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(Character applyStatus) {
		this.applyStatus = applyStatus;
	}
	@Override
	public String toString() {
		return "ApplyParttimeJobVo [applyId=" + applyId + ", userId=" + userId + ", ptId=" + ptId + ", applyTime="
				+ applyTime + ", note=" + note + ", applyStatus=" + applyStatus + "]";
	}
	
	

}
