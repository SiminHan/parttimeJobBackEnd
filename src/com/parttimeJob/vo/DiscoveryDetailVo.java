package com.parttimeJob.vo;

import java.util.ArrayList;
import java.util.Date;

import com.parttimeJob.pojo.CommendForDiscovery;

public class DiscoveryDetailVo {

	private Long discoveryId;
	private Long userId;
	private int countGood;
	private String name;
	private String summary;
	private String detail;
	private Date publishTime;
	private UserDetailVo user;
	private ArrayList<CommendForDiscovery> commends;
	public Long getDiscoveryId() {
		return discoveryId;
	}
	public void setDiscoveryId(Long discoveryId) {
		this.discoveryId = discoveryId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public int getCountGood() {
		return countGood;
	}
	public void setCountGood(int countGood) {
		this.countGood = countGood;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public ArrayList<CommendForDiscovery> getCommends() {
		return commends;
	}
	public void setCommends(ArrayList<CommendForDiscovery> commends) {
		this.commends = commends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserDetailVo getUser() {
		return user;
	}
	public void setUser(UserDetailVo user) {
		this.user = user;
	}
	
}
