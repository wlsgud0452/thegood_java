package com.javalec.base;

import java.util.Scanner;

public class ELSE03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grades = "";
		
		System.out.print("점수를 입력하세요 : ");
		
		score = scanner.nextInt();
		
		if(score>=90 && score<=100) {
			grades = "A 학점";
		}else if(score>=80 && score<=89) {
			grades = "B 학점";
		}else if(score>=70 && score<=79) {
			grades = "C 학점";
		}else if(score>=60 && score<=69) {
			grades = "D 학점";
		}else if(score>=59 && score<=0){
			grades = "F 학점";
		}
		
		System.out.println("귀하는 " + grades + "입니다");
	}
}
