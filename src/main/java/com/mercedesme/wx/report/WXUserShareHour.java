package com.mercedesme.wx.report;

import com.google.gson.annotations.SerializedName;

/**
 *获取图文分享转发分时数据
 */
public class WXUserShareHour extends WXUserShare {
	private static final long serialVersionUID = 2477195058553834148L;
	@SerializedName("ref_hour")
	private int refHour;
	public int getRefHour() {
		return this.refHour;
	}
	public void setRefHour(int refHour) {
		this.refHour = refHour;
	}
}
