package com.mercedesme.wx.report;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class WXArticleTotalDetail implements Serializable{

	private static final long serialVersionUID = 7030928445847094679L;
	@SerializedName("stat_date")
	private String startDate;
	@SerializedName("target_user")
	private int targetUser;
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
	@SerializedName("int_page_from_session_read_user")
	private int intPageFromSessionReadUser;
	@SerializedName("int_page_from_session_read_count")
	private int intPageFromSessionReadCount;
	@SerializedName("int_page_from_hist_msg_read_user")
	private int intPageFromHistMsgReadUser;
	@SerializedName("int_page_from_hist_msg_read_count")
	private int intPageFromHistMsgReadCount;
	@SerializedName("int_page_from_feed_read_user")
	private int intPageFromFeedReadUser;
	@SerializedName("int_page_from_feed_read_count")
	private int intPageFromFeedReadCount;
	@SerializedName("int_page_from_friends_read_user")
	private int intPageFromFriendsReadUser;
	@SerializedName("int_page_from_friends_read_count")
	private int intPageFromFriendsReadCount;
	@SerializedName("int_page_from_other_read_user")
	private int intPageFromOtherReadUser;
	@SerializedName("int_page_from_other_read_count")
	private int intPageFromOtherReadCount;
	@SerializedName("feed_share_from_session_user")
	private int feedShareFromSessionUser;
	@SerializedName("feed_share_from_session_cnt")
	private int feedShareFromSessionCnt;
	@SerializedName("feed_share_from_feed_user")
	private int feedShareFromFeedUser;
	@SerializedName("feed_share_from_feed_cnt")
	private int feedShareFromFeedCnt;
	@SerializedName("feed_share_from_other_user")
	private int feedShareFromOtherUser;
	@SerializedName("feed_share_from_other_cnt")
	private int feedShareFromOtherCnt;
	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getTargetUser() {
		return this.targetUser;
	}
	public void setTargetUser(int targetUser) {
		this.targetUser = targetUser;
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
	public int getIntPageFromSessionReadUser() {
		return this.intPageFromSessionReadUser;
	}
	public void setIntPageFromSessionReadUser(int intPageFromSessionReadUser) {
		this.intPageFromSessionReadUser = intPageFromSessionReadUser;
	}
	public int getIntPageFromSessionReadCount() {
		return this.intPageFromSessionReadCount;
	}
	public void setIntPageFromSessionReadCount(int intPageFromSessionReadCount) {
		this.intPageFromSessionReadCount = intPageFromSessionReadCount;
	}
	public int getIntPageFromHistMsgReadUser() {
		return this.intPageFromHistMsgReadUser;
	}
	public void setIntPageFromHistMsgReadUser(int intPageFromHistMsgReadUser) {
		this.intPageFromHistMsgReadUser = intPageFromHistMsgReadUser;
	}
	public int getIntPageFromHistMsgReadCount() {
		return this.intPageFromHistMsgReadCount;
	}
	public void setIntPageFromHistMsgReadCount(int intPageFromHistMsgReadCount) {
		this.intPageFromHistMsgReadCount = intPageFromHistMsgReadCount;
	}
	public int getIntPageFromFeedReadUser() {
		return this.intPageFromFeedReadUser;
	}
	public void setIntPageFromFeedReadUser(int intPageFromFeedReadUser) {
		this.intPageFromFeedReadUser = intPageFromFeedReadUser;
	}
	public int getIntPageFromFeedReadCount() {
		return this.intPageFromFeedReadCount;
	}
	public void setIntPageFromFeedReadCount(int intPageFromFeedReadCount) {
		this.intPageFromFeedReadCount = intPageFromFeedReadCount;
	}
	public int getIntPageFromFriendsReadUser() {
		return this.intPageFromFriendsReadUser;
	}
	public void setIntPageFromFriendsReadUser(int intPageFromFriendsReadUser) {
		this.intPageFromFriendsReadUser = intPageFromFriendsReadUser;
	}
	public int getIntPageFromFriendsReadCount() {
		return this.intPageFromFriendsReadCount;
	}
	public void setIntPageFromFriendsReadCount(int intPageFromFriendsReadCount) {
		this.intPageFromFriendsReadCount = intPageFromFriendsReadCount;
	}
	public int getIntPageFromOtherReadUser() {
		return this.intPageFromOtherReadUser;
	}
	public void setIntPageFromOtherReadUser(int intPageFromOtherReadUser) {
		this.intPageFromOtherReadUser = intPageFromOtherReadUser;
	}
	public int getIntPageFromOtherReadCount() {
		return this.intPageFromOtherReadCount;
	}
	public void setIntPageFromOtherReadCount(int intPageFromOtherReadCount) {
		this.intPageFromOtherReadCount = intPageFromOtherReadCount;
	}
	public int getFeedShareFromSessionUser() {
		return this.feedShareFromSessionUser;
	}
	public void setFeedShareFromSessionUser(int feedShareFromSessionUser) {
		this.feedShareFromSessionUser = feedShareFromSessionUser;
	}
	public int getFeedShareFromSessionCnt() {
		return this.feedShareFromSessionCnt;
	}
	public void setFeedShareFromSessionCnt(int feedShareFromSessionCnt) {
		this.feedShareFromSessionCnt = feedShareFromSessionCnt;
	}
	public int getFeedShareFromFeedUser() {
		return this.feedShareFromFeedUser;
	}
	public void setFeedShareFromFeedUser(int feedShareFromFeedUser) {
		this.feedShareFromFeedUser = feedShareFromFeedUser;
	}
	public int getFeedShareFromFeedCnt() {
		return this.feedShareFromFeedCnt;
	}
	public void setFeedShareFromFeedCnt(int feedShareFromFeedCnt) {
		this.feedShareFromFeedCnt = feedShareFromFeedCnt;
	}
	public int getFeedShareFromOtherUser() {
		return this.feedShareFromOtherUser;
	}
	public void setFeedShareFromOtherUser(int feedShareFromOtherUser) {
		this.feedShareFromOtherUser = feedShareFromOtherUser;
	}
	public int getFeedShareFromOtherCnt() {
		return this.feedShareFromOtherCnt;
	}
	public void setFeedShareFromOtherCnt(int feedShareFromOtherCnt) {
		this.feedShareFromOtherCnt = feedShareFromOtherCnt;
	}
	
}
