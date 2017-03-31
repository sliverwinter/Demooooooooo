package com.zkz.demo.reflect.demo2;

import java.lang.reflect.Constructor;

public class Test1 {
	public static void main(String[] args) {
		
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demo2.Student");
			System.out.println(c.getName()+"========================");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor<?>[] cons=c.getConstructors();
		for (Constructor<?> constructor : cons) {
			System.out.println(constructor);
		}
	}

}
