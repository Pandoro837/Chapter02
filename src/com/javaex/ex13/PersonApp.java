package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s01 = new Student();
		s01.setName("정우성");
		s01.setAge(50);
		s01.setSchoolName("서울 고등학교");
		
		System.out.println(s01.toString()); 
//		Student의 toString에는 
//		학교의 정보만 적혀있으므로, 나오지 않는다
		
		s01.showInfo();
		
		
	}

}
