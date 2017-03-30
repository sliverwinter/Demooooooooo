package com.zkz.demo.reflect;

public class Test1 {
	public static void main(String[] args) {

		Class<?> c = null;
		try {
			c = Class.forName("com.zkz.demo.reflect.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	Student s = null;
	

}
