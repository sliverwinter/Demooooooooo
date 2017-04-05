package com.zkz.demo.common;

import java.util.Calendar;

public class demoCalendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("now:" + c.get(Calendar.YEAR) + "-" + (c.get((Calendar.MONTH)) + 1) + "-" + c.get(Calendar.DATE) + " " + c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND));
		System.out.println("now:" + c.get(1) + "-" + (c.get(2) + 1) + "-" + c.get(5) + " " + c.get(11) +":"+ c.get(12) +":"+ c.get(13));

	}

}
