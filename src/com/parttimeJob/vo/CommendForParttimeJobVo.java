package com.parttimeJob.vo;

public class CommendForParttimeJobVo {
	private Long commendId;
	private String commend;
	private Long fromUserId;
	private Long ptId;
	private int score;
	private Boolean isAnonymous;
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
	public Long getPtId() {
		return ptId;
	}
	public void setPtId(Long ptId) {
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
