package com.mercedesme.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercedesme.config.WeChatConfig;
import com.mercedesme.service.WXReportService;
import com.mercedesme.utils.DateUtil;
import com.mercedesme.utils.HttpClientUtil;


@Service
public class WXReportServiceImpl implements WXReportService {
	@Autowired
	WeChatConfig weChatConfig;
	/**
	 * 用户分析数据接口
	 * @param url
	 * @param accessToken
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	@Override
	public String getUserAnalysisData(String url, String beginDateStr, String endDateStr) throws Exception{
		if(checkSearchDate(beginDateStr,endDateStr)){
			HttpClientUtil httpClientUtil = HttpClientUtil.getInstance();
			Map<String,String> params = new HashMap<>();
			params.put("begin_date", beginDateStr);
			params.put("end_date", endDateStr);
			try (CloseableHttpResponse response = httpClientUtil.sendPostRequestForResponse(url,params);) {
				String resultJson = httpClientUtil.responseToString(response);
				return resultJson;
			} catch (Exception e) {
				throw new RuntimeException("用户分析数据接口异常");
			}
		}else{
			throw new RuntimeException("日期不符合规则，1、开始日期必须小于结束日期，2、结束日期最大必须是当前日期前一天");
		}
	}

	@Override
	public String getNewsReportData(String accessToken, String beginDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessageReportData(String accessToken, String beginDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInterfaceReportData(String accessToken, String beginDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}
	private static boolean checkSearchDate(String beginDateStr,String endDateStr){
		Date beginDate = DateUtil.stringToDate(beginDateStr, DateUtil.YMD);
		Date endDate = DateUtil.stringToDate(endDateStr, DateUtil.YMD);
		Date todayDate = DateUtil.stringToDate(DateUtil.dateToString(new Date(), DateUtil.YMD), DateUtil.YMD);
		if(endDate.getTime()>=beginDate.getTime() && endDate.getTime()<todayDate.getTime()){
			return true;
		}
		return false;
	}

}
