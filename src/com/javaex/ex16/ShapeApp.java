package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

//		사각형 관리
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("초록", "검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
//		배열을 이용한 그리기
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
//		배열을 이용한 변경
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].setFillColor("파랑");
		}

		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
//		System.out.println(r01.toString());
//		변수를 이용한 그리기
//		r01.draw();
//		r02.draw();
//		r03.draw();
		
//		원 관리
		
		Circle[] cArray = new Circle[3];
	
//		변수를 만들지 않고 바로 배열에 저장
		cArray[0] = new Circle("빨강", "검정", 11);
		cArray[1] = new Circle("노랑", "검정", 22);
		cArray[2] = new Circle("초록", "검정", 33);
		
//		배열을 이용한 원 그리기
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
	}

}
