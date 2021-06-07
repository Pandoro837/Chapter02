package com.javaex.ex13;

public class Student extends Person {
//	필드
	private String schoolName;

//	생성자
	public Student() {
		super();
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}
	
//	메소드 겟터/셋터
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
//	투스트링
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", age="+ getAge()+ "]";
	}

	public void showInfo() {
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("학교명: " + this.schoolName);
	}
	
	
	
}
