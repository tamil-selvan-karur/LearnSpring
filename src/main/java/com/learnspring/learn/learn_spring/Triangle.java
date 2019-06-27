package com.learnspring.learn.learn_spring;

public class Triangle {
	Point pointA;
	Point pointB;
	Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A (" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("Point B (" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("Point C (" + pointC.getX() + "," + pointC.getY() + ")");
	}
}
