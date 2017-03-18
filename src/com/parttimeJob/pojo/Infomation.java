/**
 * 
 */
package com.parttimeJob.pojo;

import java.util.Date;

/**
 * @author simin
 *
 */
public class Infomation {
	private Long infoId;
	private String fromUserId;
	private String toUserId;
	private String title;
	private String infomation;
	private Date infoTime;
	private Boolean isRead;
	
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public String getInfomation() {
		return infomation;
	}
	public void setInfomation(String infomation) {
		this.infomation = infomation;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getInfoTime() {
		return infoTime;
	}
	public void setInfoTime(Date infoTime) {
		this.infoTime = infoTime;
	}
	public Boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}
	
	

}
