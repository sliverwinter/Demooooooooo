package com.zkz.demo.reflect.demoReal;

import java.lang.reflect.Method;

/**
 * 
 * @author I want to know where to use reflect like this？？？？？？ plz help me.
 */
public class TestReal2 {
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
			Method m1 = oj.getClass().getMethod("setAge", Integer.class);
			m1.invoke(oj, 27);
			Method m11=oj.getClass().getMethod("getAge");
			int age=(int) m11.invoke(oj);
			System.out.println("Age:"+age);
			
			Method m2=oj.getClass().getMethod("setName", String.class);
			m2.invoke(oj, "yahaha");
			Method m21=oj.getClass().getMethod("getName");
			String name=(String) m21.invoke(oj);
			System.out.println("name:"+name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
