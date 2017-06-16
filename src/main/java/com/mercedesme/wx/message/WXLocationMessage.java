package com.mercedesme.wx.message;

import com.mercedesme.wx.XStreamDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
@XStreamAlias("xml")
public class WXLocationMessage extends WXBaseMessage {
    
	private static final long serialVersionUID = -8302286107851621054L;
	
    @XStreamAlias("Location_X")
	@XStreamConverter(value = XStreamDataConverter.class)
	private String locationX;// 地理位置维度
    
    @XStreamAlias("Location_Y")
   	@XStreamConverter(value = XStreamDataConverter.class)
    private String locationY;// 地理位置经度
    
    @XStreamAlias("Scale")
   	@XStreamConverter(value = XStreamDataConverter.class)
    private String scale;// 地图缩放大小
    
    @XStreamAlias("Label")
   	@XStreamConverter(value = XStreamDataConverter.class)
    private String label;// 地理位置信息

	public String getLocationX() {
		return this.locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return this.locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public String getScale() {
		return this.scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
    
    

    
}