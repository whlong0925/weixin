package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
/**
 *获取接口分析数据
 */
public class WXInterfaceSummary implements Serializable {
	private static final long serialVersionUID = -219466860350386234L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("callback_count")
	private int callBackCount;
	@SerializedName("fail_count")
	private int failCount;
	@SerializedName("totalTimeCost")
	private int totalTimeCost;
	@SerializedName("max_time_cost")
	private int maxTimeCost;

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public int getCallBackCount() {
		return this.callBackCount;
	}

	public void setCallBackCount(int callBackCount) {
		this.callBackCount = callBackCount;
	}

	public int getFailCount() {
		return this.failCount;
	}

	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	public int getTotalTimeCost() {
		return this.totalTimeCost;
	}

	public void setTotalTimeCost(int totalTimeCost) {
		this.totalTimeCost = totalTimeCost;
	}

	public int getMaxTimeCost() {
		return this.maxTimeCost;
	}

	public void setMaxTimeCost(int maxTimeCost) {
		this.maxTimeCost = maxTimeCost;
	}

}
