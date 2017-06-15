package com.mercedesme.wx.event;

import java.io.Serializable;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
@XStreamAlias("xml")
public class WXBaseEvent implements Serializable{
    
	private static final long serialVersionUID = -2741243535488336920L;

	@XStreamAlias("ToUserName")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String toUserName;// 开发者微信号
    
	@XStreamAlias("FromUserName")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String fromUserName;// 发送方帐号（一个OpenID）
    
	@XStreamAlias("CreateTime")
    private long createTime;// 消息创建时间 （整型）
   
	@XStreamAlias("MsgType")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String msgType; // 消息类型
    
	@XStreamAlias("Event")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String event;// 事件类型

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

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

   
}