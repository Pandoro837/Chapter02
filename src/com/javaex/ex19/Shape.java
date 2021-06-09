package com.javaex.ex19;
//	내부에 추상 메소드가 하나라도 존재할 경우, 해당 클래스는
//	추상 클래스가 되어야 한다
public abstract class Shape {

//	필드
	protected String fillColor;
	protected String lineColor;
	
//	생성자
	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

//	메소드 겟터셋터
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

//	메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("[면색: " + fillColor + ", 선색: " + lineColor + "]인 도형을 그렸습니다.");
	}
	
	public abstract double area();
//	추상 메소드	- 오버라이딩 과정에서, 원치않는 문제
//	(오버라이딩을 위해 의미없는 메소드를 만들어야 하는)
//	문제를 해결하기 위해 사용하는 메소드, 오버라이딩만을 위해
//	상속을 위한 부모용 메소드로 해당 메소드가 실행되기 위해서는
//	클래스 자체가 추상 클래스가 되어야 한다.
	
}
