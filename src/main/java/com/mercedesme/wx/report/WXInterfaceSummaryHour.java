package com.mercedesme.wx.report;

import com.google.gson.annotations.SerializedName;
/**
 *获取接口分析分时数据
 */
public class WXInterfaceSummaryHour extends WXInterfaceSummary {
	private static final long serialVersionUID = 1944561526180352842L;
	@SerializedName("ref_hour")
	private int refHour;
	public int getRefHour() {
		return this.refHour;
	}
	public void setRefHour(int refHour) {
		this.refHour = refHour;
	}
	
}
