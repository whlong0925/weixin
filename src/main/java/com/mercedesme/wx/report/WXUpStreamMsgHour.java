package com.mercedesme.wx.report;

import com.google.gson.annotations.SerializedName;

/**
 * 获取消息分送分时数据
 */
public class WXUpStreamMsgHour extends WXUpStreamMsg {
	private static final long serialVersionUID = 2056121316247085750L;
	@SerializedName("ref_hour")
	private int refHour;

	public int getRefHour() {
		return this.refHour;
	}

	public void setRefHour(int refHour) {
		this.refHour = refHour;
	}

}
