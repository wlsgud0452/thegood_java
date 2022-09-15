package com.javalec.base;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0;
		int cnt = 0;
		
		System.out.print("몇 단계의 피라미드를 구성할까? : ");
		num = scanner.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for(int j =0; j <= i; j++) {
				cnt++;
				System.out.print(String.format("%3d",cnt));
			}
			System.out.println("");
			
		}

	}

}
