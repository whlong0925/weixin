package com.mercedesme.wx.response;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 回复的文本消息
 * 
 * @author whl
 *
 */
@XStreamAlias("xml")
public class WXResponseTextMessage extends WXResponseBaseMessage {
	private static final long serialVersionUID = -184856372880644747L;
	@XStreamAlias("Content")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String content;// 回复的消息内容
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
