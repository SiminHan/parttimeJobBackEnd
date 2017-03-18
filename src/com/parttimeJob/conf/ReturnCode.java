package com.parttimeJob.conf;

public interface ReturnCode {
	static final int SUCCESS = 1;
	static final int FAILURE = -1;
	
	//没有找到该用户
	static final int NOT_FIND_USER = 4001;
	//密码错误
	static final int ERROR_PASSWORD = 4002;
	//userId不能为空
	static final int EMPTY_ID = 4003;
	//用户未登录
	static final int USER_NOT_LOGIN = 4004;
	//用户不存在
	static final int USER_EXIST = 4005;
	//用户与session中保存不一致
	static final int NOT_MATCH_SESSION = 4006;
	//原密码不正确
	static final int PASSWORD_ERROR = 4007;
	
}
