package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		// 덧셈
//		System.out.println(2 + 3);
//		// 뺄셈
//		System.out.println(2 - 3);
//		// 곱셈
//		System.out.println(2 * 3);
//		// 나눗셈
//		System.out.println(2.0 / 3);
		
		// -----변수------
		// num1이라는 변수에 data 10을 할당한다.
		int num1 = 10;
		int num2 = 20;
		
		char character1 = 'a';
		String str1 = "apple";
		String str2 = "banana";
		
		int addition = num1 + num2;
		int subtract = num1 - num2;
		int multiply = num1 * num2;
		double divide = (double)num1 / num2;
//		System.out.println(num1);
//		System.out.println(num2);

		//덧셈
		System.out.println(num1 + "+" + num2 + "=" + (addition));
		//뺄셈
		System.out.println(num1 + "-" + num2 + "=" + (subtract));
		//곱셈
		System.out.println(num1 + "*" + num2 + "=" + (multiply));
		//나눗셈
		System.out.println(num1 + "/" + num2 + "=" + (divide));
//		num1 = 100;
//		System.out.println(num1);
		
		
		System.out.println(character1);
		System.out.println(str1);
		System.out.println(str1 + "," + str2);
		
	}
}



