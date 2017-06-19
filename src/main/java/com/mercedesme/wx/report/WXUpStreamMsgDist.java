package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 获取消息发送分布数据
 */
public class WXUpStreamMsgDist implements Serializable {
	private static final long serialVersionUID = -5497683777465811500L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("count_interval")
	private int countInterVal;
	@SerializedName("msg_user")
	private int msgUser;

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public int getCountInterVal() {
		return this.countInterVal;
	}

	public void setCountInterVal(int countInterVal) {
		this.countInterVal = countInterVal;
	}

	public int getMsgUser() {
		return this.msgUser;
	}

	public void setMsgUser(int msgUser) {
		this.msgUser = msgUser;
	}

}
