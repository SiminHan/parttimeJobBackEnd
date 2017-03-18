package com.parttimeJob.vo;

public class CodeMsgVo {
	private int state;
	private String massage;
	
	public CodeMsgVo() {
	}
	
	public CodeMsgVo(int state, String massage) {
		super();
		this.state = state;
		this.massage = massage;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	@Override
	public String toString() {
		return "message [state=" + state + ", massage=" + massage + "]";
	}
	
	
}
