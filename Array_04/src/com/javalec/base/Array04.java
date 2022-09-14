package com.javalec.base;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		System.out.print("Input your number : ");
		input = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(input + " X " + i + " = " + String.format("%3d",input*i )+ "\t");
			System.out.print((input+1) + " X " + i + " = " + String.format("%3d",(input+1)*i) + "\t");
			System.out.print((input+2) + " X " + i + " = " + String.format("%3d",(input+1)*i) + "\t");
			System.out.print((input+3) + " X " + i + " = " + String.format("%3d",(input+1)*i) +"\n");
		}
		//String.format("%6.2f",double변수) 총6자리 소숫점이하 2자리표현
		

	}

}
