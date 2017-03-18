package com.parttimeJob.mapper;

import java.util.ArrayList;

import com.parttimeJob.vo.ApplyParttimeJobVo;
import com.parttimeJob.vo.CommendForParttimeJobVo;
import com.parttimeJob.vo.DiscoveryDetailVo;
import com.parttimeJob.vo.InfomationVo;
import com.parttimeJob.vo.ParttimeJobSummaryVo;

public interface ApplicantMapper {

	int apply(ApplyParttimeJobVo applyParttimeJobVo) throws Exception;

	int publishDiscovery(DiscoveryDetailVo discoveryVo)  throws Exception;

	ArrayList<InfomationVo> viewInfomation(Long userId) throws Exception;

	ArrayList<ParttimeJobSummaryVo> viewApplyJobs(Long userId) throws Exception;

	int commendForParttimeJob(CommendForParttimeJobVo commendForParttimeVo) throws Exception;

}
