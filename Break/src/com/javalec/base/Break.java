package com.javalec.base;

public class Break {

	public static void main(String[] args) {
		//1	에서 100까지 출력 중 10을 만나면 Find라는 글자를 출력하고 종료하기
		
		for(int i = 0; i <= 100; i++) {
			
			if(i % 10 == 0) {
//				System.out.println("Find");
//				break;
				continue;//밑으로 내려가지 않고 위로 다시 올라
			}
			System.out.println(i);
		}
	}
}
