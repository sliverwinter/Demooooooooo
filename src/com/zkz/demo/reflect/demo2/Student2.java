package com.zkz.demo.reflect.demo2;

public class Student2 implements A,B{

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
