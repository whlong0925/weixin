package com.mercedesme.wx.crpyt;

import com.mercedesme.config.WeChatConfig;

public class WXCryptUtils {

	/**
	 * 解密
	 * @param weChatconfig
	 * @param msgSignature
	 * @param timeStamp
	 * @param nonce
	 * @param encryptedXml
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(WeChatConfig weChatconfig,String msgSignature, String timeStamp, String nonce, String encryptedXml) throws Exception {
		WXBizMsgCrypt crypt = new WXBizMsgCrypt(weChatconfig);
		return crypt.decryptMsg(msgSignature, timeStamp, nonce, encryptedXml);
		
	}
	
	/**
	 * 加密
	 * @param weChatconfig
	 * @param timeStamp
	 * @param nonce
	 * @param replyMsg
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(WeChatConfig weChatconfig, String timeStamp, String nonce,String replyMsg) throws Exception {
		WXBizMsgCrypt crypt = new WXBizMsgCrypt(weChatconfig);
		return crypt.encryptMsg(replyMsg, timeStamp, nonce);
	}

}
