package com.javaex.ex11;

public class MyMathApp {

	//필드
	private static String name;
	//생성자

	//메소드g/s



	//메소드 - 일반

	
	
	public static void main(String[] args) {

//		MyMath myMath = new MyMath();
//		
//		System.out.println(myMath.plus(100,100));
//		
//		System.out.println(myMath.plus(100.5, 100.2));
	
		System.out.println(MyMath.plus(55.5, 66.6));
		System.out.println(MyMath.plus(15, 20));
		
//		이렇게 쓸 필요가 없다
		MyMath myMath = new MyMath();
		System.out.println(myMath.plus(100, 100));
		
		System.out.println(name);
		System.out.println(circleArea(5));
		
		
	}
	
	public static double circleArea(int radius) {
		double result = radius * radius * 3.14;
		return result;
	}
	
}
