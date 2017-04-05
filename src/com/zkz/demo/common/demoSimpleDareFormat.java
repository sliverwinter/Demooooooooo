package com.zkz.demo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demoSimpleDareFormat {
	
	public static String formatDate(Date date,String formate){
		
		String result="";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(formate);
		if (date!=null) {
			result=simpleDateFormat.format(date);
		}
		return result;
	}
	
	public static Date formateDateStr(String dateStr,String formate) throws ParseException{
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(formate);
		return simpleDateFormat.parse(dateStr);
	}

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("******:"+formatDate(date,"yyyy-MM-dd"));
		
	}
	
	

}
