package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
@XStreamAlias("xml")
public class WXLinkMessage extends WXBaseMessage {
	private static final long serialVersionUID = 8266340658009514489L;
	@XStreamAlias("Title")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String title;//消息标题
	@XStreamAlias("Description")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String description;//消息描述
	@XStreamAlias("Url")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String url;//消息链接
	
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
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
