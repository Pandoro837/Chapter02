package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods(); // 디폴트 생성자
		
		camera.setName("니콘");
		camera.setPrice(350000);
		
		camera.showInfo();

		Goods computer = new Goods("그램",1000000);
		computer.showInfo();
		
		camera = new Goods("그램3",500);
//		'새로운 객체를 만들어서, 거기에 기존의 변수 camera를 연결해라'
//		로 인식되어 오류는 일어나지 않지만, 기존의 니콘이 저장된 객체에는
//		연결 할 수 없게된다.
	}

}
