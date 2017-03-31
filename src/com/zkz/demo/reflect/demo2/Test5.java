package com.zkz.demo.reflect.demo2;

public class Test5 {
	public static void main(String[] args) {
		
		 Class<?> c=null;
	        try {
	            c=Class.forName("com.zkz.demo.reflect.demo2.Student");
	        } catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        Class<?> []ifs= c.getInterfaces();
	        for(Class<?> i:ifs){
	            System.out.println(i);
	        }
	}

}
