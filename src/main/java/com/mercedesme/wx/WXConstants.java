package com.mercedesme.wx;
/**
 * 常量
 *
 */
public class WXConstants {
	// 请求消息类型
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";//文本
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";//图片
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";//语音
    public static final String REQ_MESSAGE_TYPE_VIDEO = "video";//视频
    public static final String REQ_MESSAGE_TYPE_SHORTVIDEO = "shortvideo";//小视频
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";//地理位置
    public static final String REQ_MESSAGE_TYPE_LINK = "link";//链接
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";//事件推送

    // 事件类型
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";//subscribe(订阅)
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";//unsubscribe(取消订阅)
    public static final String EVENT_TYPE_SCAN = "scan";//scan(用户已关注时的扫描带参数二维码)
    public static final String EVENT_TYPE_LOCATION = "LOCATION";//LOCATION(上报地理位置)
    public static final String EVENT_TYPE_CLICK = "CLICK";//CLICK(自定义菜单)

    // 响应消息类型
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";//文本
    public static final String RESP_MESSAGE_TYPE_IMAGE = "image";//图片
    public static final String RESP_MESSAGE_TYPE_VOICE = "voice";//语音
    public static final String RESP_MESSAGE_TYPE_VIDEO = "video";//视频
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";//音乐
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";//图文
}
