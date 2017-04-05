package com.zkz.demo.reflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test2 {
	public static void main(String[] args) {
		
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demo2.Student2");
			System.out.println(c.getName());
			System.out.println("=====================================");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Method[] mds=c.getMethods();
		for (Method method : mds) {
			System.out.println(method);
		}
	}

}
