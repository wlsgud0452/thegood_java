package com.javalec.base;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		int inputInt = 0;
		int inputQuot = 0;
		int remain = 0;
		int sum = 0;
		
		System.out.print("Enter an integer(0 ~ 9) : ");
		inputInt = scanner.nextInt();
		
		
		while(inputInt >= 1) {
			
			remain = inputInt % 10;
			sum += remain;
			inputInt = inputInt/10;
			
			
		}
		System.out.println("Sum of digits = "+sum);
		
		
		
		
	}

}
