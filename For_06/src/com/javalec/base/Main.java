package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
			
				if(i%2==0) {
				System.out.print(j + " X " + i + " = " + (j*i)+"\t");
				}else{
				System.out.print(j + " X " + "*" + " = " + (j*i)+"\t");
				}
//				switch(i%2) {
//				case 0:
//					System.out.print(j + " X " + i + " = " + (j*i)+"\t");
//					break;
//					
//				case 1:
//					System.out.print(j + " X " + "*" + " = " + (j*i)+"\t");
//					break;
//				}
				
			}
			
			System.out.println("");
		}
	}

}
