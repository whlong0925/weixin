package com.mercedesme.wx.report;

import com.google.gson.annotations.SerializedName;

/**
 * 获取图文统计分时数据
 */
public class WXUserRdadHour extends WXUserRead{
	private static final long serialVersionUID = 8586629833040650804L;
	@SerializedName("ref_hour")
	private int refHour;
	@SerializedName("user_source")
	private int userSource;

	public int getRefHour() {
		return this.refHour;
	}

	public void setRefHour(int refHour) {
		this.refHour = refHour;
	}

	public int getUserSource() {
		return this.userSource;
	}

	public void setUserSource(int userSource) {
		this.userSource = userSource;
	}

}
