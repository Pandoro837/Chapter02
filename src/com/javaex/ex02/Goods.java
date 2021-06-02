package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//메소드 - 겟터세터
	
	//메소드 - 일반
	public void setName(String name) {
		this.name = name;	
	}
	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
		
	}
	
//	public String getName() {
//		return name;
//	}
//	public int getPrice() {
//		return price;
//	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("---------------------");
	}
	
}
