package com.javalec.bace;

import java.util.Scanner;

public class IF05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strID = null;//ID
		String strPW = null;//password
		
		System.out.println("id를 입력하세요!");
		strID = scanner.next();
		
		System.out.println("Password를 입력하세요!");
		strPW = scanner.next();
		
		// ID : root, pw :1234
//		if(strID.equals("root") && strPW.equals("1234")) {
//			System.out.println("*** 환영합니다");
//		}else {
//			System.out.println("*** ID와 PW를	 확인하세요");
//		}

		if(strID.equals("root")) {
			if(strPW.equals("1234")) {
				System.out.println("환영합니다");
			}else {
				System.out.println("PW를 확인하세요");
			}
			
		}else {
			System.out.println("ID를 확인하세요");
		}
		
		scanner.close();
		
	}

}
