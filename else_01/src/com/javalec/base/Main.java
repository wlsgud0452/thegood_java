package com.javalec.base;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 //선언
	 Scanner scanner = new Scanner(System.in);
	 int money;
	 String result = "";
	 //사용자 입력
	 System.out.print("금액을 입력하세요 : ");
	 money = scanner.nextInt();
	 //비교
	 if(money>8000) {
		 result = "너무비쌉니다.";
	 }
		 else if(money>5000) {
			 result = "조금 비쌉니다.";
		 }
		 else if(money>3000) {
			 result = "적당한 금액입니다.";
		 }
		 else {
			 result = "싼편입니다.";
		 }
	 System.out.println(result);
	}
}
