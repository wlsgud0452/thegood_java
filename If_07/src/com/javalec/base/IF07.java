package com.javalec.base;

import java.util.Scanner;

public class IF07 {

	public static void main(String[] args) {
	//선언
		Scanner scanner = new Scanner(System.in);
		int inputnum = 0;
		String result = null;
		
		System.out.println("점수를 입력하세요");
		inputnum = scanner.nextInt();
		
//		if(inputnum >= 90) {
//			result = "A";
//		}else if(inputnum >= 80) {
//			result = "B";
//		}else if(inputnum >= 70) {
//			result = "C";
//		}else if(inputnum >= 60) {
//			result = "D";
//		}else {
//			result = "F";
//		}
		switch(inputnum/10) {
//			case 10:
//				result = "A";
//				break;
			case 10:
			case 9:
				result = "A";
				break;
			case 8:
				result = "B";
				break;
			case 7:
				result = "C";
				break;
			case 6:
				result = "D";
				break;
			default:
				result = "F";
				break;
		}
		System.out.println(result + "학점 입니다");
	}
		
		
	
	
}
