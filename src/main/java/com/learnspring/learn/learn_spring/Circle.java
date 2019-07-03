package com.learnspring.learn.learn_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component

public class Circle implements Shape {
	private Point center;

	public void draw() {
		System.out.println("Drawing Circle : ");
		System.out.println("Points : (" + center.getX() + ", " + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("center")
	public void setCenter(Point center) {
		this.center = center;
	}

	/*
	 * @Resource public void setCenter(Point center) { this.center = center; }
	 */

	@PostConstruct
	public void initialize() {
		System.out.println("Inititalizing circle");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroying circle");
	}

}
