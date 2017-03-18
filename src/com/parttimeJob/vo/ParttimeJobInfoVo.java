package com.parttimeJob.vo;

import java.util.ArrayList;
import java.util.Date;

import com.parttimeJob.pojo.CommendForParttimeJob;
import com.parttimeJob.pojo.User;

public class ParttimeJobInfoVo {

	private Long ptId;
	private String name;
	private int sarry;
	private int number;
	private String ptDate;
	private String ptTime;
	private Date publishDate;
	private int applyNumber;
	private String statement;   
	private String requirement;
	private Date deadline;
	private Long userId;
	private UserDetailVo user;
	private ArrayList<CommendForParttimeJob> commends;
	public Long getPtId() {
		return ptId;
	}
	public void setPtId(Long ptId) {
		this.ptId = ptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSarry() {
		return sarry;
	}
	public void setSarry(int sarry) {
		this.sarry = sarry;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPtDate() {
		return ptDate;
	}
	public void setPtDate(String ptDate) {
		this.ptDate = ptDate;
	}
	public String getPtTime() {
		return ptTime;
	}
	public void setPtTime(String ptTime) {
		this.ptTime = ptTime;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getApplyNumber() {
		return applyNumber;
	}
	public void setApplyNumber(int applyNumber) {
		this.applyNumber = applyNumber;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public ArrayList<CommendForParttimeJob> getCommends() {
		return commends;
	}
	public void setCommends(ArrayList<CommendForParttimeJob> commends) {
		this.commends = commends;
	}
	
	@Override
	public String toString() {
		return "ParttimeJobInfoVo [ptId=" + ptId + ", name=" + name + ", sarry=" + sarry + ", number=" + number
				+ ", ptDate=" + ptDate + ", ptTime=" + ptTime + ", publishDate=" + publishDate + ", applyNumber="
				+ applyNumber + ", statement=" + statement + ", requirement=" + requirement + ", user=" + user
				+ ", commends=" + commends + "]";
	}
	public UserDetailVo getUser() {
		return user;
	}
	public void setUser(UserDetailVo user) {
		this.user = user;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
}
