package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
//		디폴트 생성자 사용
//		Student s00 = new Student();
//		s00.setName("정우성");
//		s00.setAge(50);
//		s00.setSchoolName("서울 고등학교");
		
//		Student 생성자(3) 사용
//		생성자 순서(부모까지 포함)
//		Student s01 = new Student("정우성", 50, "서울 고등학교");
//		s01.showInfo();
		
//		자동으로 부모의 디폴트 생성자 사용
//		Student s02 = new Student();
		
		Student s03 = new Student("유재석", 46, "강남 고등학교");
		
		Person s04 = new Person();
		s04.name = "바보야";
		
	}
	
}
