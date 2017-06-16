package com.mercedesme.wx.message;

import java.io.Serializable;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 消息基类
 *
 */
public class WXBaseMessage implements Serializable {
	private static final long serialVersionUID = -780978878975970159L;

	@XStreamAlias("ToUserName")
	@XStreamConverter(value = XStreamDataConverter.class)
	protected String toUserName;// 开发者微信号

	@XStreamAlias("FromUserName")
	@XStreamConverter(value = XStreamDataConverter.class)
	protected String fromUserName;// 发送方帐号（一个OpenID）

	@XStreamAlias("CreateTime")
	protected Long createTime;// 消息创建时间 （整型）

	@XStreamAlias("MsgType")
	@XStreamConverter(value = XStreamDataConverter.class)
	protected String msgType;// 消息类型（text/image/location/link）
	
	@XStreamAlias("MsgId")
	@XStreamConverter(value = XStreamDataConverter.class)
	protected String msgId;// 消息id，64位整型

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

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
}
