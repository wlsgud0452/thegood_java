package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i =1; i<=100; i++) {

			sum = sum + i;
		}
		
		sum= 0;
		
		
	System.out.println(sum);
	System.out.println("1부터" + i + "까지의 합은" + sum);
	}

}
