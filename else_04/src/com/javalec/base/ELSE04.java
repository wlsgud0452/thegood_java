package com.javalec.base;

import java.util.Scanner;

public class ELSE04 {
	public static void main(String[] args) {
		
		//선언
		Scanner scanner = new Scanner(System.in);
		double weight = 0, tall = 0, bmi = 0;
		String result = "";
		
		//사용자 입력
		System.out.print("몸무게를 입력해 주세요. : ");
		weight = scanner.nextDouble();
		System.out.print("키를 입력해 주세요.(cm) : ");
		tall = scanner.nextDouble()/100;
		
		//bmi지수 계산
		bmi = weight/(tall*tall);
		
		//bmi지수 분류
		if(bmi>30) {
			result = "고도비만";
		}
			else if(bmi>=25) {
			result = "비만";
			}
			else if(bmi>=23) {
			result = "과체중";
			}
			else if(bmi>=18.5) {
			result = "정상체중";
			}
			else if(bmi>=0 && bmi<18.5) {
			result = "저체중";
			}
			else {
			System.out.println("정상적인 입력이 아닙니다.");
			return;
			}
		
		//bmi지수 출력
		System.out.println("당신의 BMI 지수는 " + bmi + "이므로 당신은 " + result + "입니다.");
		
	}
}
