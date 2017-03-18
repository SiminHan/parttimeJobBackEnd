package com.parttimeJob.vo;

import java.util.ArrayList;

public class DiscoverySummaryListVo {
	private ArrayList<DiscoverySummaryVo> items;
	private PageOption pageOption;
	public ArrayList<DiscoverySummaryVo> getItems() {
		return items;
	}
	public void setItems(ArrayList<DiscoverySummaryVo> items) {
		this.items = items;
	}
	public PageOption getPageOption() {
		return pageOption;
	}
	public void setPageOption(PageOption pageOption) {
		this.pageOption = pageOption;
	}
	

}
