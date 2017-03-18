/**
 * 
 */
package com.parttimeJob.vo;

import java.util.ArrayList;
import java.util.Date;

import com.parttimeJob.pojo.User;

/**
 * @author simin
 *
 */
public class InfomationVo {
	private Long infoId;
	private Long fromUserId;
	private Long toUserId;
	private String title;
	private String infomation;
	private Date infoTime;
	private Boolean isRead;
	private UserDetailVo fromUser;
	private UserDetailVo toUser;
	
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public Long getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}
	public Long getToUserId() {
		return toUserId;
	}
	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfomation() {
		return infomation;
	}
	public void setInfomation(String infomation) {
		this.infomation = infomation;
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
	public UserDetailVo getFromUser() {
		return fromUser;
	}
	public void setFromUser(UserDetailVo fromUser) {
		this.fromUser = fromUser;
	}
	public UserDetailVo getToUser() {
		return toUser;
	}
	public void setToUser(UserDetailVo toUser) {
		this.toUser = toUser;
	}
	
}
