package com.mercedesme.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateUtil {

    public final static String YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public final static String YMD = "yyyy-MM-dd";
    public final static String YMDHHMMSS = "yyyyMMddHHmmss";

    private static SimpleDateFormat getDateFormat(String parttern)
            throws RuntimeException {
        return new SimpleDateFormat(parttern);
    }

    public static String dateToString(Date date, String parttern) {
        String dateString = "";
        if (date != null) {
            dateString = getDateFormat(parttern).format(date);
        }
        return dateString;
    }
    public static Date stringToDate(String dateString, String parttern){
    	Date date = null;
       if(StringUtils.isNotEmpty(dateString)){
    	   try {
			date = getDateFormat(parttern).parse(dateString);
		} catch (ParseException | RuntimeException e) {
			e.printStackTrace();
		}
       }
       return date;
    }

    /**
     * 获得几天前的时间
     * @param day
     * @param patten
     * @return
     */
    public static String getDaysAgo(int day,String patten) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -day);
        date = calendar.getTime();
        return DateUtil.dateToString(date, patten);
    }
    public static Date getDaysAgo(int day) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, -day);
        date = calendar.getTime();
        return date;
    }
    /**
     * 获取毫秒前的时间
     * @param millisecond
     * @return
     */
    public static Date getMsAgo(int millisecond) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MILLISECOND, -millisecond);
        date = calendar.getTime();
        return date;
    }
    /**
     * 毫秒数转换为日期
     * @param time
     * @return
     */
    public static Date getDateByMilliseconds(long time){
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTimeInMillis(time);
    	return calendar.getTime();
    }
    
}
