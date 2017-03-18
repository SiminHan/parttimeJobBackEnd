package com.parttimeJob.vo;

import java.util.Date;

public class UserDetailVo {
	private Long userId;
	private String username;
	private String name;
	private String password;
	private String email;
	private String headImage;
	private Boolean sex;
	private Character grade;
	private String school;
	private String colleague;
	private String major;
	private String phone;
	private String introduce;
	private Character type;
	private Character status;
	private Date birthday;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Character getGrade() {
		return grade;
	}
	public void setGrade(Character grade) {
		this.grade = grade;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getColleague() {
		return colleague;
	}
	public void setColleague(String colleague) {
		this.colleague = colleague;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Character getType() {
		return type;
	}
	public void setType(Character type) {
		this.type = type;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserDetailVo [userId=" + userId + ", username=" + username + ", name=" + name + ", password=" + password
				+ ", email=" + email + ", headImage=" + headImage + ", sex=" + sex + ", grade=" + grade + ", school="
				+ school + ", colleague=" + colleague + ", major=" + major + ", phone=" + phone + ", introduce="
				+ introduce + ", type=" + type + ", status=" + status + "]";
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
