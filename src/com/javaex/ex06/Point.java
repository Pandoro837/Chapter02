package com.javaex.ex06;

public class Point {

//필드
	private int x, y;
//생성자 

	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {
		this.x = x;
	}
	
//	public Point(int y) {
//		this.y = y;
//	}		 오버로딩을 하더라도, 파라미터의 형태가 일치하면 만들 수 없다
	
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
	public void draw(boolean flag) {
		
		if(flag == false) {
			System.out.println("점 [x=" + x + ", y=" + y + "]를 지웠습니다.");
		} else {
			System.out.println("점 [x=" + x + ", y=" + y + "]를 그렸습니다.");
		}
	}
}
