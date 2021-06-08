package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
//		부모 클래스 테스트
		Shape s01 = new Shape("빨강", " 검정");
		System.out.println(s01.toString());
		
		s01.draw();
		
//		사각형 테스트

//		생성자 순서
//		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
//
//		System.out.println(r01.toString());
//		r01.draw();
	
//		사각형 관리
//		배열 만들기
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
		Rectangle r02 = new Rectangle("주황", "검정", 4, 4);
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5);

//		배열 <- 사각형
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

//		배열을 통해서 그리기
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
//		원 관리
		Circle[] cArray = new Circle[3];
 		
		cArray[0] = new Circle("빨강", "검정", 5);
		cArray[1] = new Circle("노랑", "검정", 6);
		cArray[2] = new Circle("파랑", "검정", 7);
		
//		배열을 통해서 그리기
		for(int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
//		삼각형 관리
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = new Triangle("보라", "검정", 5, 5);
		tArray[1] = new Triangle("연두", "검정", 6, 6);
		tArray[2] = new Triangle("노랑", "검정", 7, 7);
		
//		배열을 통해서 그리기
		for(int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
