package com.javalec.base;

import java.util.Scanner;

public class IF04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = new String("ABC");
		int price = 0;
		
		System.out.print("액을 입력하세요");
		price = scanner.nextInt();
		
		if(price > 8000) {
			System.out.println("너무 비쌉니다");
		}else if(price > 5000) {
			System.out.println("조금 비쌉니다");
		}else if(price > 3000) {
			System.out.println("적당한 금액 입니다");
		}else {
			System.out.println("");
		}

	}

}
