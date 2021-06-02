package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(-400000);
		//System.out.println("상품명 : " + camera.getName() + "," + camera.getPrice());
		camera.showInfo();
		
//		String cameraName = camera.getName();
		
//		System.out.println(cameraName);
		
		Goods computer = new Goods();
		computer.setName("그램");
		computer.setPrice(1000000);
		//System.out.println("상품명 : " + computer.getName() + "," + computer.getPrice());
		computer.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		//System.out.println("상품명 : " + cup.getName() + "," + cup.getPrice());
		cup.showInfo();
		
		
	}

}
