package com.learnspring.learn.learn_spring;

public class HelloWorld {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public void printHello() {
		System.out.println("Hello ! " + name + " Your age is "+age);
	}
}
