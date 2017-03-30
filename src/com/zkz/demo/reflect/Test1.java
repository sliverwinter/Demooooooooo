package com.zkz.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test1 {
	public static void main(String[] args) {
		
		//??
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Student s = null;
		Constructor<?>[] cons=c.getConstructors();
		try {
			s=(Student) cons[1].newInstance("xiaofeng",111);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);

	}

}
