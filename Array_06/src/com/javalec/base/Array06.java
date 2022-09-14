package com.javalec.base;

import java.util.Scanner;

public class Array06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, sum = 0;
		
		System.out.print("몇개의 숫자를 더할까요? : ");
		input = scanner.nextInt();
		System.out.println("4개의 숫자를 입력하세요.");
		
		for(int i = 1; i <= input; i++) {
		
			sum += scanner.nextInt();
		
		}
		
		System.out.println("입력한 숫자의 합은" + sum + "입니다.");
	}
}
