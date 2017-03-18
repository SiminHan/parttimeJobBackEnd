package com.parttimeJob.mapper;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.parttimeJob.pojo.User;
import com.parttimeJob.vo.DiscoveryDetailVo;
import com.parttimeJob.vo.DiscoverySummaryVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;
import com.parttimeJob.vo.ParttimeJobSummaryVo;
import com.parttimeJob.vo.UserDetailVo;

public interface UserMapper {
	public User findUserById(Long i) throws Exception;
	
	public ArrayList<User> selectAllUsers() throws Exception;

	public User getUserByUsername(String username) throws Exception;

	public UserDetailVo getUserById(Long userId) throws Exception;

	public int updateUserDetail(UserDetailVo userDetailVo) throws Exception;

	public User findUserByName(String username) throws Exception;

	public int insertUser(User user) throws Exception;

	public ArrayList<ParttimeJobSummaryVo> getParttimeJobSummaryList(PageOption pageOption) throws Exception;

	public ParttimeJobInfoVo getParttimeJobDetail(Long ptId) throws Exception;

	public int sendMessageToUser(InfomationVo infomationVo) throws Exception;

	public ArrayList<DiscoverySummaryVo> getDiscoverySummary(PageOption pageOption)  throws Exception;

	public DiscoveryDetailVo getDiscoveryDetail(Long discoveryId);

}
