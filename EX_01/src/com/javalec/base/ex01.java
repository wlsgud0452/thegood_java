package com.javalec.base;

import java.util.Scanner;

//몇개의 숫자를 입력하겠습니까? : 4
//1번째 숫자를 입력하세요 : 1
//2번째 숫자를 입력하세요 : 2
//3번째 숫자를 입력하세요 : 3
//4번째 숫자를 입력하세요 : 4
//귀하가 입력하신 숫자는 1 2 3 4 이고 합계는 6 이고 평균은 1.5입니다.
//그중 홀수의 갯수는 2 이고 짝수의 갯수는 2 입니다.

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int num[] = new int[100];
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		int oddCnt = 0;
		int evenCnt = 0;

		System.out.print("몇개의 숫자를 입력하겠습니까? : ");
		input = scanner.nextInt();

		for (int i = 0; i < input; i++) {
			cnt += 1;

			System.out.print(i+1 + "번째 숫자를 입력하세요 : ");
			num[i] = scanner.nextInt();

			sum += num[i];

			if (num[i] % 2 == 0) {
				evenCnt += 1;
			} else {
				oddCnt += 1;
			}

		}
		avg = (double) sum / cnt;

		System.out.print("귀하가 입력하신 숫자는 ");

		for (int j = 0; j < cnt; j++) {
			System.out.print(num[j] + " ");
		}

		System.out.println("이고 합계는 " + sum + " 이고 평균은 " + avg + "입니다.");
		System.out.println("그중 홀수의 갯수는 " + oddCnt + " 이고 짝수의 갯수는 " + evenCnt + " 입니다.");

	}
}
