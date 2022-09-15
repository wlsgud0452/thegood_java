package com.javalec.base;

import java.util.Scanner;

public class Array09 {

//사용자에게 시작값과 끝값을 입력 받아 합계 구하기
	// -----------------------------
	// 시작값을 입력해주세요 : 1
	// 마지막값을 입력해주세요 : 10
	// 합계는 55입니다
	// 홀수의 합계는 25입니다
	// 짝수의 합계는 30입니다
	// 합계는 5.5입니다
	// 홀수의 합계 평균은 __입니다.
	// 짝수의 합계 평균은 __입니다.
	public static void main(String[] args) {
		// 선언부
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int tot = 0;
		int oddSum = 0;
		int evenSum = 0;
		double avg = 0.0;
		int oddCnt = 0;
		int evenCnt = 0;
		int change = 0;
		System.out.print("시작값을 입력해주세요 : ");
		start = scanner.nextInt();
		System.out.print("마지막값을 입력해주세요 : ");
		end = scanner.nextInt();
		if (start > end) {
			change = start;
			start = end;
			end = change;
			
		}
		for (int i = start; i <= end; i++) {

			tot += i;
			if (i % 2 == 0) {
				evenSum += i;
				evenCnt += 1;
			} else {
				oddSum += i;
				oddCnt += 1;
			}
		}
		avg = (double) tot / (end - start + 1);

		System.out.println("합계는 " + tot + " 입니다");
		System.out.println("홀수의 합계는 " + oddSum + " 입니다");
		System.out.println("짝수의 합계는 " + evenSum + " 입니다");
		System.out.println("합계의 평균은 " + avg + " 입니다");
		System.out.println("홀수의 평균은 " + ((double) evenSum / evenCnt) + " 입니다");
		System.out.println("짝수의 평균은 " + ((double) oddSum / oddCnt) + " 입니다");

	}

}
