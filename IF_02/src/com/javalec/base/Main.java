package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//선언부
		Scanner scanner = new Scanner(System.in);//Scanner 정의
		int num1;
		int num2;
		String result = "";
		
		//사용자 입력내용 가져오
		System.out.print("첫번째 숫자를 입력하세요. : ");
		num1 = scanner.nextInt();//첫번째 숫자
		System.out.print("두번째 숫자를 입력하세요. : ");
		num2 = scanner.nextInt();//두번째 숫자
		
		// 두 수 비교하기
		if(num1<num2) {
			result = "보다 작습니다.";
		}
		else if(num1>num2) {
			result = "보다 큽니다.";
		}
		else{
			result = "와 같습니다.";
		}
		
		//결과 출력하기
		System.out.println("\n<Result>\n첫번째 숫자가 두번째 숫자" + result + "\nThank you");
		
	}

}
