package com.javalec.base;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0; 
		double avg = 0.0;
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1+"번의 숫자를 입력하세요 : ");
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		
		avg = (double)sum / num.length;
		System.out.println("합계 : " + sum + " 평균 : " + avg);

	}

}
