/**
 * 
 */
package com.parttimeJob.pojo;

import java.util.Date;

/**
 * @author simin
 *
 */
public class CommendForDiscovery {
	private Long commendId;
	private String commend;
	private String fromUserId;
	private String discoveryId;
	private int score;
	private Boolean isAnonymous;
	private Date commendDate;
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
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getDiscoveryId() {
		return discoveryId;
	}
	public void setDiscoveryId(String discoveryId) {
		this.discoveryId = discoveryId;
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
	public Date getCommendDate() {
		return commendDate;
	}
	public void setCommendDate(Date commendDate) {
		this.commendDate = commendDate;
	}
	
}
