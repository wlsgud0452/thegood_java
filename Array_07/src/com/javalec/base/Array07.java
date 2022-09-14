package com.javalec.base;

import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, max = 0, max_index = 0;
		int num[] = new int[99];
		//int num = 0;
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		input = scanner.nextInt();
		
		if(input < 100) {
			System.out.println(input + "개의 숫자를 입력하세요!");
			
			for(int i = 1; i <= input; i++) {
				
				num[i] = scanner.nextInt();
				
				if(max<num[i]) {
					//max = num;
					max = num[i];
					max_index = i;
				}
				
			}
			
			System.out.println("입력한 숫자 중 최대값은 " + max + "이고 " + max_index + "번째 값 입니다.");
		}
		

	}

}
