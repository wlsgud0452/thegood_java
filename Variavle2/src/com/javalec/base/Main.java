package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum1 = 0, sum2 = 0, first = 0, end = 0;
		//sum1 = 짝수, sum2 =  홀수, first =  시작값, end =  마지막값
		double avr = 0.0;
		
		System.out.println("시작 숫자를 입려하세요 : ");
		first = scanner.nextInt();
		System.out.println("끝 숫자를 입력하세요 : ");
		end = scanner.nextInt();
		
		for(; first <= end; first++) {
			
			switch(first % 2) {
			
			case 0:
				sum1 = sum1 + first;
				break;
			default:
				sum2 = sum2 + first;
				
			}	
		}
		avr = (((double)(sum1+sum2)/(end-first+1)));
		
		System.out.println("짝수의 합은" + sum1 + "입니다");
		System.out.println("홀수의 합은" + sum2 + "입니다");
		System.out.println("전체 평균은" + avr + "입니다.");
	}

}
