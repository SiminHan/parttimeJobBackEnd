package com.parttimeJob.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parttimeJob.conf.ReturnCode;
import com.parttimeJob.mapper.PublisherMapper;
import com.parttimeJob.pojo.User;
import com.parttimeJob.service.PublisherService;
import com.parttimeJob.vo.ApplicantsSummaryListVo;
import com.parttimeJob.vo.CodeMsgVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.PageOption;
import com.parttimeJob.vo.ParttimeJobInfoVo;

@Service("publisherService")
public class PublisherServiceImpl implements PublisherService {
	
	@Autowired
	PublisherMapper publisherMapper;
	
	public CodeMsgVo getUserValid(HttpSession session,Long userId) throws Exception{
		CodeMsgVo codeMsgVo = null;
		User user = (User) session.getAttribute("user");
		if(user == null){
			codeMsgVo = new CodeMsgVo(ReturnCode.USER_NOT_LOGIN,"用户未登录");
		}else {
			if(user.getUserId()!= userId){
				codeMsgVo = new CodeMsgVo(ReturnCode.NOT_MATCH_SESSION,"用户与session中保存不一致");
			}else {
				codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"用户验证合法");
			}
		}
		return codeMsgVo;
	}

	@Override
	public CodeMsgVo publish(HttpSession session, ParttimeJobInfoVo parttimeJobInfoVo) throws Exception {
		CodeMsgVo codeMsgVo = null;
		codeMsgVo = getUserValid(session,parttimeJobInfoVo.getUserId());
		if(codeMsgVo.getState() == ReturnCode.SUCCESS){
			int result = publisherMapper.publish(parttimeJobInfoVo);
			if(result > 0){
				codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"兼职信息提交成功");
			}else {
				codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"兼职信息提交失败");
			}
		}
		return codeMsgVo;
	}

	@Override
	public Object viewApplicantsSummary(HttpSession session, Long ptId, PageOption pageOption) throws Exception {
		CodeMsgVo codeMsgVo = null;
		User user = (User) session.getAttribute("user");
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("ptId", ptId);
		params.put("pageSize", pageOption.getPageSize());
		params.put("pageNum", pageOption.getPageNum());
		if(user != null){
			ApplicantsSummaryListVo applicantsSummaryListVo = new ApplicantsSummaryListVo();
			applicantsSummaryListVo.setItems(publisherMapper.viewApplicantsSummary(params));
			System.err.println(applicantsSummaryListVo.getItems());
			return applicantsSummaryListVo;
		}else{
			codeMsgVo = new CodeMsgVo(ReturnCode.USER_NOT_LOGIN,"用户未登录");
			return codeMsgVo;
		}
	}

	@Override
	public CodeMsgVo sendMessageToUsers(HttpSession session, InfomationVo infomationVo,ArrayList<Long> userIds) throws Exception {
		CodeMsgVo codeMsgVo = null;
		codeMsgVo = getUserValid(session,infomationVo.getFromUserId());
		if(codeMsgVo.getState() == ReturnCode.SUCCESS){
			if(userIds.size() > 0){
				ArrayList<InfomationVo> messageList = new ArrayList<InfomationVo>();
				for(int i=0 ; i< userIds.size() ; i++){
					InfomationVo temp = new InfomationVo();
					temp.setFromUserId(infomationVo.getFromUserId());
					temp.setToUserId(userIds.get(i));
					temp.setTitle(infomationVo.getTitle());
					temp.setInfomation(infomationVo.getInfomation());
					messageList.add(temp);
				}
				int result = publisherMapper.sendMessageToUsers(messageList);
				if(result > 0){
					codeMsgVo = new CodeMsgVo(ReturnCode.SUCCESS,"通知提交成功");
				}else {
					codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"通知提交失败");
				}
			}else {
				System.err.println(userIds);
				codeMsgVo = new CodeMsgVo(ReturnCode.FAILURE,"用户数组不能为空");
			}
		}
		return codeMsgVo;
	}

	@Override
	public Object viewApplicantDetail(HttpSession session, Long userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
