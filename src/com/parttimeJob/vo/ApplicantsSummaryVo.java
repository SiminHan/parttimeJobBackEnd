package com.parttimeJob.vo;

import java.util.Date;

public class ApplicantsSummaryVo {
	private UserDetailVo user;
	private ApplyParttimeJobVo apply;
	private Long applyId;
	public Long getApplyId() {
		return applyId;
	}
	public void setApplyId(Long applyId) {
		this.applyId = applyId;
	}
	public UserDetailVo getUser() {
		return user;
	}
	public void setUser(UserDetailVo user) {
		this.user = user;
	}
	public ApplyParttimeJobVo getApply() {
		return apply;
	}
	public void setApply(ApplyParttimeJobVo apply) {
		this.apply = apply;
	}
	@Override
	public String toString() {
		return "ApplicantsSummaryVo [user=" + user + ", apply=" + apply + "]";
	}
	

}
