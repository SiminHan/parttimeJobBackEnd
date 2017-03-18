package com.parttimeJob.vo;

import java.util.Date;

public class DiscoverySummaryVo {
	private Long discoveryId;
	private Long userId;
	private int countGood;
	private String discoveryName;
	private String summary;
	private Date publishTime;
	private String username;
	private String name;
	private String school;
	private String grade;
	private String major;
	private String colleague;
	private String headImage;
	private char type;
	private Boolean sex;
	public Long getDiscoveryId() {
		return discoveryId;
	}
	public void setDiscoveryId(Long discoveryId) {
		this.discoveryId = discoveryId;
	}
	public Long getUserId() {
		return userId;
	}
	public String getSchool() {
		return school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getColleague() {
		return colleague;
	}
	public void setColleague(String colleague) {
		this.colleague = colleague;
	}
	public char getType() {
		return type;
	}
	public void setStatus(char type) {
		this.type = type;
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
	public String getDiscoveryName() {
		return discoveryName;
	}
	public void setDiscoveryName(String discoveryName) {
		this.discoveryName = discoveryName;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	
}
