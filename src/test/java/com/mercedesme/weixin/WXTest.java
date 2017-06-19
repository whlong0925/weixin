package com.mercedesme.weixin;

import java.lang.reflect.Type;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.reflect.TypeToken;
import com.mercedesme.service.WXReportService;
import com.mercedesme.utils.GsonUtils;
import com.mercedesme.utils.HttpClientUtil;
import com.mercedesme.wx.WXConstants;
import com.mercedesme.wx.report.WXReportData;
import com.mercedesme.wx.report.WXUserCumulate;
import com.mercedesme.wx.report.WXUserSummary;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WXTest {
	private final static String appId = "wxc83b186fdf42694e";
	private final static String secret = "c45bccccf9ffac4b0193d9851f8a4e49";
	private final static String accessToken = "dYifd7m3tbMRctoxC3nVvRMpEiKnPlTtddDM8afsDZc3m977ERBpPDPd3lrcNj8JwZrVJxSDhAJkj3wU5D5h5K7uhU8acwv05MQqJU-Xxom8ekDFyWc767kSWVkwP8bpRWCbAGAXCI";
	@Autowired
	private WXReportService wxReportService;
	/**
	 * 获取accessToken
	 */
	@Test
	public void testAccessToken() {
		String url = String.format(WXConstants.ACCESS_TOKEN_URL, appId, secret);
		HttpClientUtil httpClientUtil = HttpClientUtil.getInstance();
		try (CloseableHttpResponse response = httpClientUtil.sendGetRequestForResponse(url);) {
			String tokenJson = httpClientUtil.responseToString(response);
			System.out.println(tokenJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取用户增减数据
	 */
	@Test
	public void testUserSummary() throws Exception{
		//{"list":[{"ref_date":"2017-06-17","user_source":0,"new_user":0,"cancel_user":0},{"ref_date":"2017-06-17","user_source":30,"new_user":2,"cancel_user":0}]}
		String url = String.format(WXConstants.DATA_GETUSERSUMMARY_URL, accessToken);
		String response = this.wxReportService.getUserAnalysisData(url, "2017-06-15", "2017-06-18");
		Type objectType = new TypeToken<WXReportData<WXUserSummary>>() {}.getType();
		System.out.println(response);
		if(!response.contains("errcode")){
			WXReportData<WXUserSummary> reportData = GsonUtils.fromJsonString(response, objectType);
			System.out.println(reportData.getList().size());
		}
	}
	/**
	 * 获取用户累计数据
	 */
	@Test
	public void testUserCumulate() throws Exception{
		//{"list":[{"ref_date":"2017-06-17","user_source":0,"cumulate_user":2},{"ref_date":"2017-06-18","user_source":0,"cumulate_user":2}]}
		String url = String.format(WXConstants.DATA_GETUSERCUMULATE_URL, accessToken);
		String response = this.wxReportService.getUserAnalysisData(url, "2017-06-15", "2017-06-18");
		Type objectType = new TypeToken<WXReportData<WXUserCumulate>>() {}.getType();
		WXReportData<WXUserCumulate> reportData = GsonUtils.fromJsonString(response, objectType);
		System.out.println(reportData.getList().size());
	}
}
