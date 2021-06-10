package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {

//		Point p01 = new Point(5, 5);
//		p01.draw();

//		Drawable dp01 = new Point(10, 10);
//		dp01.draw();
		
//		배열(Drawable[])을 만든다
		Drawable[] dArray = new Drawable[4];
		
//		사각형을 만든다
		Drawable r01 = new Rectangle("빨강", "검정", 7, 7);
//		Drawable 인터페이스로 선언된 변수이기에
//		해당 메소드(draw)만 사용할 수 있다

//		원을 만든다
		Drawable c01 = new Circle("주황", "주황", 5);
		
//		삼각형을 만든다
		Drawable t01 = new Triangle("노랑", "검정", 15, 15);
		
//		점을 만든다
		Drawable p01 = new Point(100, 100);

//		배열 < - 도형을 넣는다
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
//		배열을 이용하여 전부 그린다
		for(int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
//		사각형의 면적 출력
//		System.out.println(((Rectangle)dArray[2]).area());
//		System.out.println(((Shape)dArray[2]).area());
		
//		배열을 이용하여 면적을 구한다
		for(int i = 0; i < dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
			System.out.println(((Shape)dArray[i]).area());
			}
		}
		
		for(int i = 0; i < dArray.length; i++) {
			if(!(dArray[i] instanceof Shape)) {
				System.out.println("점");
			}
		}
		
	}

}
