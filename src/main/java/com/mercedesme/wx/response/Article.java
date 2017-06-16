package com.mercedesme.wx.response;

import java.io.Serializable;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 图文model
 */
@XStreamAlias("xml")
public class Article implements Serializable {

	private static final long serialVersionUID = 6771885903897900499L;

	@XStreamAlias("Title")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String title;// 图文消息名称

	@XStreamAlias("Description")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String description;// 图文消息描述

	@XStreamAlias("PicUrl")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String picUrl; // 图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80

	@XStreamAlias("Url")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String url;// 点击图文消息跳转链接

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}