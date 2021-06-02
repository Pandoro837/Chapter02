package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point point = new Point();
		Point point02 = new Point();
		
		point.setX(5);
		point.setY(5);
		
		point.draw();
		
		point02.setX(10);
		point02.setY(23);
		
		point02.draw();
		
	}
}
