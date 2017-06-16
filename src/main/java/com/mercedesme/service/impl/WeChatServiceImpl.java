package com.mercedesme.service.impl;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercedesme.config.WeChatConfig;
import com.mercedesme.service.WeChatService;
import com.mercedesme.utils.HttpClientUtil;
import com.mercedesme.wx.WXConstants;

@Service
public class WeChatServiceImpl implements WeChatService {
	@Autowired
	private WeChatConfig weChatConfig;

	@Override
	public boolean checkSignature(String timestamp, String nonce, String signature) {
		String[] strs = new String[] { this.weChatConfig.getToken(), timestamp, nonce };
		Arrays.sort(strs);
		StringBuilder sb = new StringBuilder();
		for (String a : strs) {
			sb.append(a);
		}
		return signature.equals(DigestUtils.sha1Hex(sb.toString()));
	}

	@Override
	public String getAccessToken(boolean refresh) {
		if(refresh){
			String url = String.format(WXConstants.ACCESS_TOKEN_URL, this.weChatConfig.getAppId(),this.weChatConfig.getSecret());
			HttpClientUtil httpClientUtil = HttpClientUtil.getInstance();
			try (CloseableHttpResponse response = httpClientUtil.sendGetRequestForResponse(url);){
				 String tokenJson = httpClientUtil.responseToString(response);
				 System.out.println(tokenJson);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			//redis获取
		}
		return null;
	}
}
