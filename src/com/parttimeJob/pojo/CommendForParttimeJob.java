package com.parttimeJob.pojo;

import java.util.Date;

public class CommendForParttimeJob {
	private Long commendId;
	private String commend;
	private Long fromUserId;
	private String ptId;
	private int score;
	private Boolean isAnonymous;
	private Date commendDate;
	public Date getCommendDate() {
		return commendDate;
	}
	public void setCommendDate(Date commendDate) {
		this.commendDate = commendDate;
	}
	public Long getCommendId() {
		return commendId;
	}
	public void setCommendId(Long commendId) {
		this.commendId = commendId;
	}
	public String getCommend() {
		return commend;
	}
	public void setCommend(String commend) {
		this.commend = commend;
	}
	public Long getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getPtId() {
		return ptId;
	}
	public void setPtId(String ptId) {
		this.ptId = ptId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Boolean getIsAnonymous() {
		return isAnonymous;
	}
	public void setIsAnonymous(Boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}
	
	
}
