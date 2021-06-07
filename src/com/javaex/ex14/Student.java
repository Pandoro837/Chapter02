package com.javaex.ex14;

public class Student extends Person {
//	필드
	private String schoolName;

//	생성자
	public Student() {
		System.out.println("Student(0)");
	}
	
//	public Student(String name, int age, String schoolName) {
//		this.setName(name);
//		this.setAge(age);
//		this.schoolName = schoolName;
//	}
	
//	부모의 Pesrson(name, age)를 빌려 쓰고, schoolName만 자신이 처리
//	public Student(String name, int age, String schoolName) {
//		super(name, age);
//		this.schoolName = schoolName;
//		System.out.println("student(3)");
//	
//	}
	
//	부모의 Person() 생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);
		super.setAge(age);
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
		System.out.println("이름: " + name); 
		//name이 protected로 연결되어 있어서 사용이 가능하다
		System.out.println("나이: " + getAge());
		System.out.println("학교명: " + this.schoolName);
	}
}
