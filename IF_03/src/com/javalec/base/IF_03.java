package com.javalec.base;

public class IF_03 {

	public static void main(String[] args) {
		int i = 20;
		int j = 10;
		
		if(i>j) {
			System.out.println("i는 j보다" + (i-j) + "만큼 큽니다");
		}else if (j<j) {
			System.out.println("j는 i보다" + (j-i) + "만큼 큽니다");
		}else {
			System.out.println("i와 j는 동일합니다.");
		}
		
		System.out.println("계산이 완료되었씁니");

	}//main

}//IF_03
