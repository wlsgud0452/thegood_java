package com.javalec.base;

public class While01 {

	public static void main(String[] args) {
		//1부터 100까지의 합
		int i = 0, sum = 0;
		
		
		while(true) {
			
			sum +=i;
			i++;
			if(i>100) {
				break;
			}
			
		}
		System.out.println(sum);

	}

}
