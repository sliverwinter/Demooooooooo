package com.zkz.demo.reflect.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.InterfaceAddress;

public class Test4 {
	public static void main(String[] args) {
		
		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.demo2.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?>[] inf=c.getInterfaces();
		for (Class<?> i : inf) {
			System.out.println(i);
		}
	}

}
