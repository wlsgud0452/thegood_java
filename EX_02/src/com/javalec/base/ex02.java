package com.javalec.base;

public class ex02 {
	public static void main(String[] args) {
		double sum = 1;

		for (int i = 0; i <= 10; i++) {

			System.out.print("10^ " + String.format("%2d", i) + " = ");
			System.out.println(String.format("%12.0f", sum));
			sum*=10;

		}

	}
}
