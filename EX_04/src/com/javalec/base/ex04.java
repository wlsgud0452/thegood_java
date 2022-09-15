package com.javalec.base;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int scoreInt[] = new int[10];
		int cnt = 0;
		int histoCnt = 0;
		
		System.out.println("Input score : ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "위의 score : ");
			scoreInt[scanner.nextInt()/10]++;
		}
		scanner.close();

		System.out.println("-------- Histogram --------");

		for (int i = (scoreInt.length-1); i >= 0; i--) {
			System.out.print(String.format("%3d", i) + " : ");
			for (int j = 1; j <= scoreInt[i]; j++) {
				System.out.print("#");
			}

			System.out.println("");
		}

	}

}
