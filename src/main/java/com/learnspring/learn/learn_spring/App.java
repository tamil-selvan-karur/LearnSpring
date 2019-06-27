package com.learnspring.learn.learn_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Learning Spring
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		SecondBean obj2 = (SecondBean) context.getBean("secondBean");
		obj2.printBankData();
	}
}
