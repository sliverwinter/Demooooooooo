package com.zkz.demo.reflect.demo1;

import java.lang.reflect.Constructor;

public class Test1 {
	public static void main(String[] args) {
		
		//??
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demo1.Student1");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student1 s = null;
		Constructor<?>[] cons=c.getConstructors();
		try {
			s=(Student1) cons[1].newInstance("xiaofeng",111);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);

	}

}
