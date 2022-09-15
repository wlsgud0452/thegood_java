package com.javalec.base;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int newPosition = 0;
		int newNum = 0;
		int change = 0;

		// 입력
		System.out.print("입력할 숫자의 갯수? : ");
		int input[] = new int[scanner.nextInt() + 1];
		System.out.println((input.length - 1) + "개의 숫자를 입력하세요!");
		// 배열길이 만큼의 숫자 입력
		for (int i = 0; i < input.length - 1; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			input[i] = scanner.nextInt();
		}

		// 숫자 삽입.
		System.out.print("숫자를 삽입하고자 하는 위치는? : ");
		newPosition = scanner.nextInt() - 1;

		for (int i = 0; i < input.length; i++) {

			if (i == newPosition) {
				for (int j = input.length - 1; j >= i; j--) {
					input[j] = input[j - 1];
				}
			}
		}

		System.out.print("삽입하고자 하는 수는? : ");
		newNum = scanner.nextInt();
		input[newPosition] = newNum;

		// 결과
		System.out.println("------ 결과 ------");
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
