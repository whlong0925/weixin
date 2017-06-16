package com.mercedesme.wx.response;

import java.io.Serializable;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 响应消息的基类
 *
 */
@XStreamAlias("xml")
public class WXResponseBaseMessage implements Serializable{
	private static final long serialVersionUID = -123437494064550510L;

	@XStreamAlias("ToUserName")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String toUserName;// 接收方帐号（收到的OpenID）

	@XStreamAlias("FromUserName")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String fromUserName;// 开发者微信号

	@XStreamAlias("CreateTime")
	private long createTime;// 消息创建时间 （整型）

	@XStreamAlias("MsgType")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String msgType;// 消息类型

	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return this.fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}