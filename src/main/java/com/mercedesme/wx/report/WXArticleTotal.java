package com.mercedesme.wx.report;

import java.io.Serializable;
import java.util.List;

/**
 * 获取图文群发总数据
 */
public class WXArticleTotal implements Serializable {

	private static final long serialVersionUID = -6035278679127904872L;
	private String ref_date;
	private String msgId;
	private String title;
	private List<WXArticleTotalDetail> details;

	public String getRef_date() {
		return this.ref_date;
	}

	public void setRef_date(String ref_date) {
		this.ref_date = ref_date;
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

	public List<WXArticleTotalDetail> getDetails() {
		return this.details;
	}

	public void setDetails(List<WXArticleTotalDetail> details) {
		this.details = details;
	}

}
