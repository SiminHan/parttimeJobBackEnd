/**
 * 
 */
package com.parttimeJob.pojo;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author simin
 *
 */
public class Discovery {
	private Long discoveryId;
	private String userId;
	private int countGood;
	private String name;
	private String summary;
	private String detail;
	private Date publishTime;
	private ArrayList<CommendForDiscovery> commends;
	public Long getDiscoveryId() {
		return discoveryId;
	}
	public void setDiscoveryId(Long discoveryId) {
		this.discoveryId = discoveryId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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
	
	

}
