package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * 获取图文统计数据
 */
public class WXUserRead implements Serializable {
	private static final long serialVersionUID = -4664935871881740134L;
	@SerializedName("ref_date")
	private String ref_date;
	@SerializedName("int_page_read_user")
	private int intPageReadUser;
	@SerializedName("int_page_read_count")
	private int intPageReadCount;
	@SerializedName("ori_page_read_user")
	private int oriPageReadUser;
	@SerializedName("ori_page_read_count")
	private int oriPageReadCount;
	@SerializedName("share_user")
	private int shareUser;
	@SerializedName("share_count")
	private int shareCount;
	@SerializedName("add_to_fav_user")
	private int addToFavUser;
	@SerializedName("add_to_fav_count")
	private int addToFavCount;

	public String getRef_date() {
		return this.ref_date;
	}

	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
	}

	public int getIntPageReadUser() {
		return this.intPageReadUser;
	}

	public void setIntPageReadUser(int intPageReadUser) {
		this.intPageReadUser = intPageReadUser;
	}

	public int getIntPageReadCount() {
		return this.intPageReadCount;
	}

	public void setIntPageReadCount(int intPageReadCount) {
		this.intPageReadCount = intPageReadCount;
	}

	public int getOriPageReadUser() {
		return this.oriPageReadUser;
	}

	public void setOriPageReadUser(int oriPageReadUser) {
		this.oriPageReadUser = oriPageReadUser;
	}

	public int getOriPageReadCount() {
		return this.oriPageReadCount;
	}

	public void setOriPageReadCount(int oriPageReadCount) {
		this.oriPageReadCount = oriPageReadCount;
	}

	public int getShareUser() {
		return this.shareUser;
	}

	public void setShareUser(int shareUser) {
		this.shareUser = shareUser;
	}

	public int getShareCount() {
		return this.shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	public int getAddToFavUser() {
		return this.addToFavUser;
	}

	public void setAddToFavUser(int addToFavUser) {
		this.addToFavUser = addToFavUser;
	}

	public int getAddToFavCount() {
		return this.addToFavCount;
	}

	public void setAddToFavCount(int addToFavCount) {
		this.addToFavCount = addToFavCount;
	}

}
