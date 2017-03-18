package com.parttimeJob.vo;

import java.util.ArrayList;

public class ApplicantsSummaryListVo {
	private ArrayList<ApplicantsSummaryVo> items;
	private PageOption pageOption;
	public ArrayList<ApplicantsSummaryVo> getItems() {
		return items;
	}
	public void setItems(ArrayList<ApplicantsSummaryVo> items) {
		this.items = items;
	}
	public PageOption getPageOption() {
		return pageOption;
	}
	public void setPageOption(PageOption pageOption) {
		this.pageOption = pageOption;
	}
	@Override
	public String toString() {
		return "ApplicantsSummaryListVo [items=" + items + ", pageOption=" + pageOption + ", getItems()=" + getItems()
				+ ", getPageOption()=" + getPageOption() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
