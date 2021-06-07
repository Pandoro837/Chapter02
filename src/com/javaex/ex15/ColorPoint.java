package com.javaex.ex15;

public class ColorPoint extends Point{

//	필드
	private String color;
	
//	생성자
	public ColorPoint() {
		
	}
	public ColorPoint(String color) {
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
//	겟터셋터
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
//	메소드 일반
	public void showInfo() {
		System.out.println("X좌표: " + super.getX() + ", Y좌표: " + super.getY() + ", 색상: " + this.color + "인 점을 그렸습니다.");
	}
	
	
	
}
