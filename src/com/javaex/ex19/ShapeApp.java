package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
//		Ex17번처럼 각 도형별로 배열을 만들면 
//		해당 배열을 모두 기억해야 사용할 수 있다
//		하나의 배열로 모두 관리 할 수 있을까?
		
//		도형(Shape) 배열을 만든다.
		Shape[] sArray = new Shape[3];

//		도형을 만든다.
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정", 5);
		Shape st01 = new Triangle("노랑", "검정", 10, 10);

//		sr01.getWidth();   부모의 클래스로 자식의 참조변수를 사용 했을 경우,
						 //자식의 메소드, 필드 값을 가져올 수 없다
						 //(자식이 무엇을 가지고 있을지 알 수 없기 때문)
						 //하지만 오버라이딩을 이용, shape에 같은 메소드를 만들어
						 //return 값을 비워둘 경우, 자식의 메소드 값을 불러올 수는 있다.
						 //하지만 이럴 경우, 부모의 클래스만 사용 할 때는 
						 //필요없는 메소드가 생긴다
		System.out.println(((Rectangle)sr01).getWidth());
//		하향 형변환을 통해서, 오버라이딩을 하지 않은 
//		자식의 메소드를 불러 올 수 있다
		
//		sc01.getRadius; Shape 참조형으로 Circle생성자를 통해 객체를 만들면
//		Circle의 메소드는 나오지 않는다
		
//		배열 < - 도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;

		
//		배열을 이용해서 그리기
		for(int i = 0; i < sArray.length; i++) {
//			오버라이딩을 이용한 구현
			sArray[i].draw();
			System.out.println("넓이:" + sArray[i].area());
		}
		
		
//		오버라이딩의 부작용
		Shape ss01 = new Shape("검정", "검정"); 
		//Shape가 추상 클래스가 되었기 때문에 (abstract)
		//해당 클래스를 인스턴스화 하는 것이 불가능하다
		ss01.area();	
//		추상 메소드를 사용하여 오버라이딩을 할 경우
//		자식에게 반드시 같은 이름의 메소드가 있어야한다
		
		System.out.println("Shape 넓이:" + ss01.area());
//		부모 클래스로 부모 클래스를 선언할 경우, 오버라이딩을 위한 메소드가
//		원치 않는 값으로 출력되는 경우가 생길 수 있다
//		추상 메소드와 추상 클래스를 사용하면 이 문제를 해결 할 수 있다
		
//		Shape의 메소드 draw라고 쓰여있지만, 해당 하는 자식 클래스의 draw 메소드가
//		작동하고 있다 = 오버라이딩
//		부모와 자식의 메소드 명이 같고, 같은 시그니쳐(==파라미터, 매개변수)를 가질 때
//		부모의 메소드로 표기되어도, 같은 조건을 갖는 자식의 메소드가 실행된다
		
//		배열 < - 사각형
		
//		배열 < - 원
	
//		배열 < - 삼각형
		

		
		
		
		
		
	}

}
