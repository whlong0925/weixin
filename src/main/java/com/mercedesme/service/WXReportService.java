package com.mercedesme.service;
public interface WXReportService {
	public String getUserAnalysisData(String url,String beginDate,String endDate) throws Exception;//用户分析统计
	public String getNewsReportData(String accessToken,String beginDate,String endDate);//图文分析统计
	public String getMessageReportData(String accessToken,String beginDate,String endDate);//消息分析统计
	public String getInterfaceReportData(String accessToken,String beginDate,String endDate);//接口分析统计
	
}
