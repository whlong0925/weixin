package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
/**
 * 获取累计用户数据
 *
 */
public class WXUserCumulate implements Serializable{
	private static final long serialVersionUID = 8515378136064578882L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("cumulate_user")
	private int cumulateUser;
	public String getRefDate() {
		return this.refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public int getCumulateUser() {
		return this.cumulateUser;
	}
	public void setCumulateUser(int cumulateUser) {
		this.cumulateUser = cumulateUser;
	}
	
}
