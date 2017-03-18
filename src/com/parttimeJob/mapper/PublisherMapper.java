package com.parttimeJob.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import com.parttimeJob.vo.ApplicantsSummaryVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.ParttimeJobInfoVo;

public interface PublisherMapper {

	public int publish(ParttimeJobInfoVo parttimeJobInfoVo) throws Exception;

	public ArrayList<ApplicantsSummaryVo> viewApplicantsSummary(HashMap<String, Object> params) throws Exception;

	public int sendMessageToUsers(ArrayList<InfomationVo> messageList) throws Exception;

}
