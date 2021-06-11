package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double result;
		System.out.print("숫자:");
		int num = sc.nextInt();
		sc.close();
		

		try {
			result = 100/num; // java.lang.ArithmeticException
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("finally 영역");
		}
		

		

	}

}
