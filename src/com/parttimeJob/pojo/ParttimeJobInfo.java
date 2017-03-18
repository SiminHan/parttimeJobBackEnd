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
public class ParttimeJobInfo {
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
	private String userId;
	private Date deadline;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ArrayList<CommendForParttimeJob> getCommend() {
		return commends;
	}
	public void setCommend(ArrayList<CommendForParttimeJob> commends) {
		this.commends = commends;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
}
