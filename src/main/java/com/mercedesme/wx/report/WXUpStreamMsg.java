package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 获取消息发送概况数据
 */
public class WXUpStreamMsg implements Serializable {
	private static final long serialVersionUID = 8059482902309669959L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("msg_type")
	private int msgType;
	@SerializedName("msg_user")
	private int msgUser;
	@SerializedName("msg_count")
	private int msgCount;

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public int getMsgType() {
		return this.msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public int getMsgUser() {
		return this.msgUser;
	}

	public void setMsgUser(int msgUser) {
		this.msgUser = msgUser;
	}

	public int getMsgCount() {
		return this.msgCount;
	}

	public void setMsgCount(int msgCount) {
		this.msgCount = msgCount;
	}

}
