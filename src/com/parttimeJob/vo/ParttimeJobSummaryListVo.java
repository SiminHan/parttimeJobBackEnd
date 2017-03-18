package com.parttimeJob.vo;

import java.util.ArrayList;

public class ParttimeJobSummaryListVo {
	private ArrayList<ParttimeJobSummaryVo> items;
	private PageOption pageOption;
	
	public ArrayList<ParttimeJobSummaryVo> getItems() {
		return items;
	}
	public void setItems(ArrayList<ParttimeJobSummaryVo> items) {
		this.items = items;
	}
	public PageOption getPageOption() {
		return pageOption;
	}
	public void setPageOption(PageOption pageOption) {
		this.pageOption = pageOption;
	}
	
	

}
