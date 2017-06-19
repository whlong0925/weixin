package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
/**
 * 获取图文群发每日数据
 *
 */
public class WXArticleSummary implements Serializable {
	private static final long serialVersionUID = -6931560336603419787L;
	@SerializedName("ref_date")
	private String refDate;
	@SerializedName("msgid")
	private String msgId;
	@SerializedName("title")
	private String title;
	@SerializedName("int_page_read_user")
	private int intPageReadUser;
	@SerializedName("int_page_read_count")
	private int intPageReadCount;
	@SerializedName("ori_page_read_user")
	private int oriPageReadUser;
	@SerializedName("ori_page_read_count")
	private int oripageReadCount;
	@SerializedName("share_user")
	private int shareUser;
	@SerializedName("share_count")
	private int shareCount;
	@SerializedName("add_to_fav_user")
	private int addToFavUser;
	@SerializedName("add_to_fav_count")
	private int addToFavCount;
	public String getRefDate() {
		return this.refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getOripageReadCount() {
		return this.oripageReadCount;
	}
	public void setOripageReadCount(int oripageReadCount) {
		this.oripageReadCount = oripageReadCount;
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
