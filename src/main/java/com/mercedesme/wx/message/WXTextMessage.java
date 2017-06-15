package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
/**
 * 文本消息
 *
 */
@XStreamAlias("xml")
public class WXTextMessage extends WXBaseMessage {

	private static final long serialVersionUID = 6647871145921124207L;
	
	@XStreamAlias("Content")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String content;// 消息内容

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}