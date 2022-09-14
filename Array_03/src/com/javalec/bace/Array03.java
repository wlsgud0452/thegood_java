package com.javalec.bace;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[5];
		int sum = 0, max = 0, min = 500, min_index = 0, max_index = 0;
		double avg = 0.0;
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.print(name[i] + "의 신장을 입력하세요 : ");
			height[i] = scanner.nextInt();
			sum += height[i];
			
			if(max<height[i]) {
				max = height[i];
				max_index = i;
			}else if(min>height[i]) {
				min = height[i];
				min_index = i;
			}
		}
		
		avg = (double)sum/name.length;
		
		System.out.println("평균신장은 : " + avg);
		System.out.println("가장 큰 학생은 " + name[max_index] + " 이고 그 학생의 키는 " + height[max_index]);
		System.out.println("가장 작은 학생은 " + name[min_index] + " 이고 그 학생의 키는 " + height[min_index]);
	}

}
