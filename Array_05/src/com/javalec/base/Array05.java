package com.javalec.base;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int factor = 1, j = 0;
		
		System.out.println("Input your decimal no. : ");
		input = scanner.nextInt();
		
//		for(int i = 1; i <= input; i++) {
//			
//			factor *= i;
//			
//			
//		}
		
		for(int i = input; i >= 1; i--) {
			
			factor *= i;
		}
		
		System.out.println("4's factorial value = " + factor);
		
		
	}

}
