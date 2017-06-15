package com.mercedesme.service;

public interface WeChatService {
	boolean checkSignature(String timestamp, String nonce, String signature);
}
