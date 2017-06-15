package com.mercedesme.service.impl;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercedesme.config.WeChatConfig;
import com.mercedesme.service.WeChatService;
@Service
public class WeChatServiceImpl implements WeChatService {
	@Autowired
	private WeChatConfig weChatConfig;
	@Override
	public boolean checkSignature(String timestamp, String nonce, String signature) {
		String[] strs=new String[] {this.weChatConfig.getToken(),timestamp,nonce};  
	    Arrays.sort(strs);  
	    StringBuilder sb = new StringBuilder();
	    for (String a : strs) {
	      sb.append(a);
	    }
		return signature.equals(DigestUtils.sha1Hex(sb.toString()));
	}

}
