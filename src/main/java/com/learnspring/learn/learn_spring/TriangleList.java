package com.learnspring.learn.learn_spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleList implements InitializingBean, DisposableBean {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("Point (" + point.getX() + "," + point.getY() + ")");
		}
	}

	public void destroy() throws Exception {
		System.out.println("DisposableBean init method inside Triangle list");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method inside Triangle list");
		
	}
	
	public void myInit() {
		System.out.println("MyInit method inside Triangle list");
	}
	
	public void myDestroy() {
		System.out.println("MyDestroy method inside Triangle list");
	}

}
