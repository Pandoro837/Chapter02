package com.javaex.ex12;

public class Student {
//	필드
	private String name, schoolName;
	private int age;
	
//	생성자
	public Student(){
		
	}
	public Student(String name, int age, String schoolName){
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}
	
//	겟터셋터
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	투스트링
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", schoolName=" + schoolName + ", age=" + age + "]";
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	
}
