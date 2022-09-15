package com.javalec.base;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 선언
		Scanner scanner = new Scanner(System.in);
		
		int[] koreanScore = new int[4];
		int[] englishScore = new int[4];
		int[] mathScore = new int[4];
		int sum = 0;
		double avg = 0.0;
		
		// 입력부
		System.out.println("Korean의 성적을 입력");
		for(int i=0; i<koreanScore.length;i++) {
			System.out.print("No"+(i+1)+"의 성적은 :");
			koreanScore[i] = scanner.nextInt();
		}
		System.out.println("English의 성적을 입력");
		for(int i=0; i<englishScore.length;i++) {
			System.out.print("No"+(i+1)+"의 성적은 :");
			englishScore[i] = scanner.nextInt();
		}
		System.out.println("Mathematics의 성적을 입력");
		for(int i=0; i<mathScore.length;i++) {
			System.out.print("No"+(i+1)+"의 성적은 :");
			mathScore[i] = scanner.nextInt();
		}
		scanner.close();
		// 출력부
		System.out.println("\tKorean\t\t English\t Mathematics\t Total\t\t Average");
		for(int i=0;i<4;i++) {
			sum = koreanScore[i]+englishScore[i]+mathScore[i];
			avg = sum / 3.0;
			
			System.out.print("No"+(i+1)+"\t"+String.format("%4d", koreanScore[i]));
			System.out.print("\t\t"+String.format("%4d", englishScore[i])+"\t\t"+String.format("%4d", mathScore[i]));
			System.out.print("\t\t"+String.format("%4d", sum)+"\t\t"+String.format("%4.0f", avg));
			System.out.println();
		}
	}

}