package com.javalec.base;

import java.util.Scanner;

class Menu{
	Scanner scanner = new Scanner(System.in);
	int clientNum[] = new int[5]; //고객정보
	//입금
	public void menu1() {
		
		int clientNum =0, money =0;
		
		System.out.print("고객번호 : ");
		clientNum = scanner.nextInt();
		
		System.out.print("금액 : ");
		money = scanner.nextInt();
		this.clientNum[clientNum-1] += money;  
		
		System.out.println("입금 결과 : 고객번호 : "+clientNum+" 잔액 : "+ this.clientNum[clientNum-1]);
		
		
	}
	//출금
	public void menu2() {
		
		int clientNum =0, money =0;
		
		System.out.print("고객번호 : ");
		clientNum = scanner.nextInt();
		
		System.out.print("금액 : ");
		money = scanner.nextInt();
		
		if(this.clientNum[clientNum-1] < money) {
			System.out.println("잔액이 부족합니다!");
		}else {
			this.clientNum[clientNum-1] -= money; 
			System.out.println("입금 결과 : 고객번호 : "+clientNum+" 잔액 : "+ this.clientNum[clientNum-1]);
		}
	}
	//현황조회
	public void menu3() {
		
		System.out.println("\t고객명\t잔액");
		System.out.println("\t----\t---");
		for(int i = 0;i<=clientNum.length-1;i++) {
			
			System.out.println("\t"+ (i+1) + "\t"+ clientNum[i]);
		}
	}
}

public class ex10 {
	
	
	public static void main(String[] args) {
		//선언문
		Scanner scanner = new Scanner(System.in);
		Menu menu = new Menu();
		int input = 0;
		String inputStr[] = {".입금",".출금",".현황",".종료"}; 
		
		while(input<4) {
			//메뉴 출력
			for(int i =1;i<=4;i++) {
			System.out.println(i+inputStr[i-1]);
			}
			//메뉴 선택
			System.out.print("번호를 선택하세요 : ");
			input = scanner.nextInt();
			
			if(input == 1) {
				menu.menu1();
			}else if(input == 2) {
				menu.menu2();
			}else if(input == 3) {
				menu.menu3();
			}else {
				System.out.println(">>>>> Tank you <<<<<");
				break;
			}
			System.out.println("_________________________\n");
			//
			
			
			
		}

	}

}
