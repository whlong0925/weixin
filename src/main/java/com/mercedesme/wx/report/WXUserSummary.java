package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
/**
 * 获取用户增减数据
 *
 */
public class WXUserSummary implements Serializable{
	private static final long serialVersionUID = -3047807404742679076L;
	@SerializedName("ref_date")
	private String refDate;
	/**
	 * 0代表其他合计 
	 * 1代表公众号搜索 
	 * 17代表名片分享 
	 * 30代表扫描二维码 
	 * 43代表图文页右上角菜单 
	 * 51代表支付后关注（在支付完成页） 
	 * 57代表图文页内公众号名称 
	 * 75代表公众号文章广告 
	 * 78代表朋友圈广告
	 */
	@SerializedName("user_source")
	private int userSource;
	/**
	 * 新增的用户数量
	 */
	@SerializedName("new_user")
	private int newUser;
	/**
	 * 取消关注的用户数量，new_user减去cancel_user即为净增用户数量
	 */
	@SerializedName("cancel_user")
	private int cancelUser;
	public String getRefDate() {
		return this.refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public int getUserSource() {
		return this.userSource;
	}
	public void setUserSource(int userSource) {
		this.userSource = userSource;
	}
	public int getNewUser() {
		return this.newUser;
	}
	public void setNewUser(int newUser) {
		this.newUser = newUser;
	}
	public int getCancelUser() {
		return this.cancelUser;
	}
	public void setCancelUser(int cancelUser) {
		this.cancelUser = cancelUser;
	}
}
