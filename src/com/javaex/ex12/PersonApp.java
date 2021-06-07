package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p00 = new Person("정우성", 46);
		p00.showInfo();

		p00.toString();
		System.out.println(p00.toString());
		
		Student s00 = new Student("이효리", 40, "제주고등학교");
		s00.print();
		
	}

}
