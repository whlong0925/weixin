package com.mercedesme.wx.event;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
/**
 * 上报地理位置事件
 *
 */
@XStreamAlias("xml")
public class WXLocationEvent extends WXBaseEvent {

	private static final long serialVersionUID = -8549196063593157042L;
	@XStreamAlias("Latitude")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String latitude;// 地理位置纬度
	@XStreamAlias("Longitude")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String longitude;// 地理位置经度
	@XStreamAlias("Precision")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String precision; // 地理位置精度

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPrecision() {
		return this.precision;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

}