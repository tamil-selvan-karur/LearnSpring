package com.learnspring.learn.learn_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Triangle triangle = (Triangle)
		 * context.getBean("triangle"); triangle.draw();
		 */

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-list.xml");
		context.registerShutdownHook();
		TriangleList triangle = (TriangleList) context.getBean("triangle");
		triangle.draw();
		context.close();

	}
}
