package com.javalec.base;

import java.util.Scanner;

public class ex09 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int delNum = 0;

		System.out.print("입력할 숫자의 갯수? : ");
		int inputNum[] = new int[scanner.nextInt()];

		System.out.println(inputNum.length+"개의 숫자를 입력하세요! : ");
		for (int i = 0; i < inputNum.length; i++) {
			
			System.out.print((i+1)+"의 숫자 : ");
			inputNum[i] = scanner.nextInt();			
		}
		
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? : ");
		delNum = scanner.nextInt();
		
		for(int i =delNum-1; i<inputNum.length-1;i++) {
			inputNum[i]=inputNum[i+1];
		}
		System.out.println("------ 결과 ------");
		
		for(int i = 1; i<=inputNum.length-1; i++) {
			System.out.println(inputNum[i-1]);
		}

	}

}
