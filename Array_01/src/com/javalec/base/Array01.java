package com.javalec.base;

public class Array01 {

	public static void main(String[] args) {
		//배열(Array)
		//문자열 7개를 넣을 수 있는 배열 만들기
		/*
		String[] str = new String[7];
		
		str[0] = "일요일";
		str[1] = "월요일";
		str[2] = "화요일";
		str[3] = "수요일";
		str[4] = "목요일";
		str[5] = "금요일";
		str[6] = "토요일";
		
		for(int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
		
		}
		System.out.println(str.length);
		*/
		
		
		//배열 초기값을 넣고 작업하기
		/*
		int[] intNum = {1,5,8,12,200,1002};
		int sum = 0; 
		double avg = 0.0;
		//배열에 데이터 확인
		for(int i = 0; i<intNum.length; i++) {
			System.out.println(intNum[i]);
		}
		
		//배열의 평균 구하기
		for(int j = 0; j < intNum.length; j++) {
			sum += intNum[j];//총합계산
		}
		avg = (double)sum / intNum.length;//평균계산
		System.out.println(avg);//평균출력
		*/
		//----------------------------------
		
		//배열에 해당하는 구구단 출력
		int[] intNum = {7, 5, 3, 9};
		
		for(int i = 2; i <= 9; i++) {
			
			for(int j = 0; j < intNum.length; j++) {
				System.out.print(intNum[j] + " X " + i + " = " + intNum[j]*i+"\t");
			}
			
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
