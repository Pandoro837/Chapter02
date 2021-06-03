package com.javaex.ex05;

public class Goods {
//필드
	private String name;
	private int price;

//생성자 - Goods를 메모리에 올리는 역할
//생성자가 별도로 지정되지 않았을 경우, 자동으로 만들어진다
//			(이름, 형태가 정해져있기 때문) 
//	단, 디폴트 생성자는 생성자가 하나라도 있으면 사라진다
//		내부에 코드를 넣어 실행 시 바로 작동하게 할 수 있다
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
//	파라미터의 형태나 순서가 다르면, 다른 생성자로 인식하지만
//	사용자가 헷갈릴 수도 있다
	public Goods(int price, String name) {
		this.name = name;
		this.price = price;
	}

//생성자에서 셋터의 일을 대신 할 수 있으나
//내부의 값을 확인, 수정하기 위해서는 셋터와 겟터가 필요하다
//셋터	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//겟터	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
//메소드	
	public void showInfo() {
		System.out.println("상품명: " + name + ", " + "가격: " + price);
	}
	
}
