package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자의 입력값이 짝수인지 홀수 인지 알려주기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요 : ");
//		System.out.println(scanner.nextInt());
		int num1 = scanner.nextInt();
		String result = ( (num1 % 2) == 1 ? "홀" : "짝");
		System.out.println(result); 
		
		
	}

}
