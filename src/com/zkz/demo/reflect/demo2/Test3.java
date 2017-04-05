package com.zkz.demo.reflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.InterfaceAddress;

public class Test3 {
	public static void main(String[] args) {
		
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demo2.Student2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Field[] fields=c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("属性："+field);
		}
	}

}
