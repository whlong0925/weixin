package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 获取图文分享转发数据
 */
public class WXUserShare implements Serializable {
	
	private static final long serialVersionUID = 7283744591071689124L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("share_scene")
	private int shareScene;
	@SerializedName("share_count")
	private int shareCount;
	@SerializedName("share_user")
	private int shareUser;

	public String getRefDate() {
		return this.refDate;
	}

	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}

	public int getShareScene() {
		return this.shareScene;
	}

	public void setShareScene(int shareScene) {
		this.shareScene = shareScene;
	}

	public int getShareCount() {
		return this.shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	public int getShareUser() {
		return this.shareUser;
	}

	public void setShareUser(int shareUser) {
		this.shareUser = shareUser;
	}

}
