package com.javaex.ex15;

public class Point {
//	필드
	private int x, y;

//	생산자
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	겟터셋터
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
//	메소드 일반
	public void showInfo() {
		System.out.println("X좌표: " + this.x + ", Y좌표: " + this.y +"인 점을 그렸습니다.");
	}
	
}
