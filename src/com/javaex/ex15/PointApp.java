package com.javaex.ex15;

public class PointApp {
	
	public static void main(String[] args) {
		
	Point p = new Point(4,4);
	ColorPoint cp1 = new ColorPoint("red");
	ColorPoint cp2 = new ColorPoint(10, 10, "blue");
	
//	부모와 자식 모두 동일한 이름의 메소드를 갖고 있을 경우
//	부모는 자신의 메소드를 가져온다. 부모는 자식의 메소드를 가져올 수 없다.
//	자식도 자신의 메소드를 가져온다. 이름이 같을 경우, 자신의 메소드가 
//	우선순위에 올라간다. 즉, 굳이 같은 명칭의 메소드를 만든다는 것은
//	해당 객체에서 부모의 메소드를 사용하지 않겠다는 의미이다.
//	만약 둘 중 한가지를 선택해서 사용하고 싶다면
//	메소드의 이름을 다르게 짓거나, 오버로딩을 이용
//	파라미터의 값을 다르게 만들어서 인식시켜야 한다
	
	p.showInfo();
	cp1.showInfo();
	cp2.showInfo();
	
	
	
	}
}
