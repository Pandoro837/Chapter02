package com.javaex.ex14;

public class Person {
//	필드
//	private는 보안이 철저하나 자신의 클래스 내에서만 사용이 가능하다
//	protected를 사용하면 자식에게까지만 사용이 가능하고, 외부에서는 불가능하다
	protected String name; 
	private int age;
	
//	생성자
	
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
//	겟터셋터
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
//	데이터 확인용, toStirng으로 해당 내용들을 문자열로 완성해준다(출력은 x)
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
//	메소드 일반
	
	public void showInfo() {//화면출력 부분, 지금은 간단하게 처리
		System.out.println("======================="); 
		System.out.println("이름: " + this.name + ", 나이: " + this.age);
		System.out.println("======================="); 
	}
}
