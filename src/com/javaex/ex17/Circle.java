package com.javaex.ex17;

public class Circle extends Shape {

//	필드
	private int radius;
	
//	생성자
	public Circle() {
		
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
//	메소드 겟터셋터
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
//	메소드 일반
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 반지름:" + radius +  "]인 원을 그렸습니다.");
	}
	
	
}
