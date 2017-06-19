package com.mercedesme.wx;

/**
 * 常量
 *
 */
public class WXConstants {
	// 微信access_token的grant_type
	public static final String ACCESSTOKEN_GRANT_TYPE = "client_credential";
	// 请求消息类型
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";// 文本
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";// 图片
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";// 语音
	public static final String REQ_MESSAGE_TYPE_VIDEO = "video";// 视频
	public static final String REQ_MESSAGE_TYPE_SHORTVIDEO = "shortvideo";// 小视频
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";// 地理位置
	public static final String REQ_MESSAGE_TYPE_LINK = "link";// 链接
	public static final String REQ_MESSAGE_TYPE_EVENT = "event";// 事件推送

	// 事件类型
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";// subscribe(订阅)
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";// unsubscribe(取消订阅)
	public static final String EVENT_TYPE_SCAN = "scan";// scan(用户已关注时的扫描带参数二维码)
	public static final String EVENT_TYPE_LOCATION = "LOCATION";// LOCATION(上报地理位置)
	public static final String EVENT_TYPE_CLICK = "CLICK";// CLICK(自定义菜单)

	// 响应消息类型
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";// 文本
	public static final String RESP_MESSAGE_TYPE_IMAGE = "image";// 图片
	public static final String RESP_MESSAGE_TYPE_VOICE = "voice";// 语音
	public static final String RESP_MESSAGE_TYPE_VIDEO = "video";// 视频
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";// 音乐
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";// 图文
	
	public static final String ACCESS_TOKEN_URL="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	//获取用户增减数据
	public static final String DATA_GETUSERSUMMARY_URL="https://api.weixin.qq.com/datacube/getusersummary?access_token=%s";
	//获取累计用户数据
	public static final String DATA_GETUSERCUMULATE_URL="https://api.weixin.qq.com/datacube/getusercumulate?access_token=%s";
	//获取图文群发每日数据
	public static final String DATA_ARTICLESUMMARY_URL="https://api.weixin.qq.com/datacube/getarticlesummary?access_token=%s";
	//获取图文群发总数据	
	public static final String DATA_ARTICLETOTA_URL="https://api.weixin.qq.com/datacube/getarticletotal?access_token=%s";
	//获取图文统计数据
	public static final String DATA_USERREAD_URL="https://api.weixin.qq.com/datacube/getuserread?access_token=%s";
	//获取图文统计分时数据
	public static final String DATA_USERREADHOUR_URL="https://api.weixin.qq.com/datacube/getuserreadhour?access_token=%s";
	//获取图文分享转发数据
	public static final String DATA_USERSHARE_URL="https://api.weixin.qq.com/datacube/getusershare?access_token=%s";
    //获取图文分享转发分时数据	
	public static final String DATA_USERSHAREHOUR_URL="https://api.weixin.qq.com/datacube/getusersharehour?access_token=%s";
}
