package com.mercedesme.wx.event;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 自定义菜单事件
 */
@XStreamAlias("xml")
public class WXMenuEvent extends WXBaseEvent {
	private static final long serialVersionUID = 4535588576403521648L;
	@XStreamAlias("EventKey")
	@XStreamConverter(value = XStreamCDataConverter.class)
	private String eventKey;// 事件KEY值，与自定义菜单接口中KEY值对应

	public String getEventKey() {
		return this.eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

}