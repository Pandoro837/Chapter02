package com.javaex.ex20;

public class Rectangle extends Shape implements Drawable{

//	필드
	private int width;
	private int height;
	
//	생성자
	public Rectangle() {
//		super(); == Shape();
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		
		this.width = width;
		this.height = height;
		
	}

//	메소드 겟터셋터
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
//	메소드 일반
	
	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 가로:" + width + ", 세로:" + height + "]인 사각형을 그렸습니다.");
	}
	
	public double area() {
		return (this.width * this.height); 
	}
	
	
}
