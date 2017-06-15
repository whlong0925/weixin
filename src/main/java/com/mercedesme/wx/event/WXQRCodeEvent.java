package com.mercedesme.wx.event;

import com.mercedesme.wx.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * 二维码事件
 *
 */
@XStreamAlias("xml")
public class WXQRCodeEvent extends WXBaseEvent {

	private static final long serialVersionUID = -2679258043053221491L;
	@XStreamAlias("EventKey")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String eventKey;// 事件KEY值
	@XStreamAlias("Ticket")
	@XStreamConverter(value = XStreamCDataConverter.class)
    private String ticket;// 用于换取二维码图片
	public String getEventKey() {
		return this.eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public String getTicket() {
		return this.ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
}
