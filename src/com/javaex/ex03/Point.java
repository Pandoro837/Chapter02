package com.javaex.ex03;

public class Point {

//필드
	private int x, y;

// 겟터셋터
// 변수와 파라미터의 변수명이 같을 필요가 있을 때
// this. 를 입력하면, 구분 해줄 수 있다(this. = 파라미터의 값)
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x=" + x + ", y=" + y + "]를 그렸습니다.");
	}
}
