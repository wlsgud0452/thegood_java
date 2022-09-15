package com.javalec.base;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		//선언문
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int result = 0;
		//입력
		System.out.print("입력할 숫자의 갯수? : ");
		int input[] = new int[scanner.nextInt()];
		System.out.println(input.length + "개의 숫자를 입력하세요!");
		//배열길이 만큼의 숫자 입력
		for(int i = 0; i<input.length; i++) {
			System.out.print((i+1) + "의 숫자 : " );
			input[i]=scanner.nextInt();
		}
		//검색할 숫자 입력
		System.out.print("검색할 숫자는? : ");
		num = scanner.nextInt();
		//검색한 숫자 찾기
		for(int i = 0; i < input.length; i++) {
			if(input[i]==num) {
				result = i+1;
			}
		}
		//출력
		if(result > 0) {
		System.out.println(num + "의 위치는 " + result + "번째 입니다.");
		}else {
			System.out.println(num + "는 존재하지 않습니다.");
		}
		
	}

}
