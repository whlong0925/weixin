package com.mercedesme.service;

import com.mercedesme.utils.GsonUtils;
import com.mercedesme.wx.WXAccessToken;

public abstract class AbstractAccessTokenService {
	/**
	 * 获取token
	 * @param appId
	 * @param secret
	 * @return
	 */
	public abstract String getWXAccessToken(String appId,String secret);
	/**
	 * 将json字符串转换为对象
	 * @param jsonToken
	 * @return
	 */
	public WXAccessToken jsonString2AccessToken(String jsonToken){
		return GsonUtils.fromJsonString(jsonToken, WXAccessToken.class);
	}
}
