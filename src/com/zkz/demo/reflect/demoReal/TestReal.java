package com.zkz.demo.reflect.demoReal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @author I want to know where to use reflect like this？？？？？？ plz help me.
 */
public class TestReal {
	public static void main(String[] args) {

		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demoReal.StudentReal");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			//in mar,getMethod not like this,just '.getMethod("getAge")',why change? plz help me
			Object oj = c.newInstance();
			Field nameField=c.getDeclaredField("name");
			nameField.setAccessible(true);
			nameField.set(oj, "yahaha");
			nameField.get(oj);
			System.out.println(nameField.get(oj));
			System.out.println(oj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
