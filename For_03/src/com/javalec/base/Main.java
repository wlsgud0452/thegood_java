package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		int sum1 = 0, sum2 = 0;
		//sum1 = 짝수의 합 , sum2 = 홀수의 합
		for (int i = 0; i <= 100; i=i+2) {
			
			sum1 = sum1 + i;
			
		}
		for (int j = 1; j <= 100; j=j+2) {
			
			sum2 = sum2 + j;
			
		}
		
		System.out.println("짝수의 합 : " + sum1+ "\n홀수의 합 : " + sum2);

	}

}
