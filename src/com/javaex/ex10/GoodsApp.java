package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		int count = 0;
//		배열의 각 방에, 참조형의 주소를 담을 수 있다
//		int[] intArray = new int[3]; 인트 형의 배열과 형태 비교
		Goods[] goodsArray = new Goods[3]; 
		
		System.out.println(goodsArray.length);
		
		Goods computer = new Goods("그램", 1000000);
		Goods camera = new Goods("니콘", 400000);
		
//		computer.showInfo();
//		camera.showInfo();		- 상품의 갯수가 늘어나면 하나 하나 다 써야한다
		
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		
		System.out.println(computer.getName());
		
		System.out.println(goodsArray[0].getName());		
		
		for(int i = 0; i < goodsArray.length; i++) {
			if(goodsArray[i] != null) {
//			배열 내부의 값이 초기값이 아니면, 출력한다
				count = count + 1;
				goodsArray[i].showInfo();	
			}
			
		}
		System.out.println(count);
	}

}
