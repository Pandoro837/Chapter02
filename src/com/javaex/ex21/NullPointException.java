package com.javaex.ex21;

public class NullPointException {

	public static void main(String[] args) {
		// NullPointException 

		Rectangle r01 = new Rectangle("빨강", "검정", 10, 10);
		r01.draw();
		
		r01 = null;	// 참조변수가 참조할 주소값이 없을 경우
					// NullPointException이 발생한다
		
		try {
			r01.draw();
		} catch (NullPointerException e) {
			System.out.println("널 포인트");
		}
		
	}

}
