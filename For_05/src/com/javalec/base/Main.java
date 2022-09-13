package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int start = 0 , end = 0, rest = 0, sum = 0, max = 0, min = 0, cnt = 0;
		int change_start = 0,change_end = 0;
		double avr = 0;
		
		System.out.println("시작하는 숫자를 정하세요. : ");
		start = scanner.nextInt();
		System.out.println("범위의 끝 숫자를 정하세요. : ");
		end = scanner.nextInt();
		System.out.println("원하는 나머지 값의 수는? : ");
		rest = scanner.nextInt();
		
		if(start>end) {
			change_start = start;
			change_end = end;
			start = change_end;
			end = change_start;
		}
		
		for(int i = start; i <= end; i++) {
			
			switch(i%10) {
			case 5:
			cnt++;
			sum = sum + i;
			max = i;
			if(cnt == 1) {
				min = i;
			}
			
			break;
			}
			
			
			
		}
		
		avr = (double)sum / cnt;
		
		System.out.println(start + "부터 " + end + "범위중 10으로 나누었을 경우");
		System.out.println("나머지가 " + rest + "인 숫자의 갯수는 " + cnt + "개이고 합은 " + sum +"이다");
		System.out.println("나머지가 " + rest + "인 숫자의 평균은 " + avr + "이고,");
		System.out.println("나머지가 " + rest + "인 숫자중 최대숫자는 " + max + "이고, 최소숫자는 " + min + "입니다.");
	}

}














