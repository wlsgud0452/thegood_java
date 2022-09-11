package com.javalec.base;

import java.util.Scanner;

public class ELSE02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//선언
			int kor = 0, eng = 0, math = 0;//kor = 국어점, eng = 영어점수, math = 수학점수 
			double avr = 0;//평균
	
			System.out.println("국어 점수를 입력하세요!");
			kor = scanner.nextInt();
			if(kor <= 100 && kor > 0) {
				System.out.println("영어 점수를 입력하세요!");
				eng = scanner.nextInt();
				if(eng <= 100 && eng > 0) {
					System.out.println("수학 점수를 입력하세요!");
					math = scanner.nextInt();
					if(math <= 100 && math > 0) {
	
						//평균점수
						avr = (kor+eng+math)/3.0;
						System.out.println("평균점수 : " + avr);
						//국어점수 비교
						if(kor>avr) {
							System.out.println("국어 점수는 평균보다 높습니다.");
						}else if(kor<avr) {
							System.out.println("국어 점수는 평균보다 낮습니다.");
						}else {
							System.out.println("국어 점수는 평균점수 입니다.");
						}
						//영어점수 비교
						if(eng>avr) {
							System.out.println("영어 점수는 평균보다 높습니다.");
						}else if(eng<avr) {
							System.out.println("영어 점수는 평균보다 낮습니다.");
						}else {
							System.out.println("영어 점수는 평균점수 입니다.");
						}
						//수학점수 비교
						if(math>avr) {
							System.out.println("수학 점수는 평균보다 높습니다.");
						}else if(math<avr) {
							System.out.println("수학 점수는 평균보다 낮습니다.");
						}else {
							System.out.println("수학 점수는 평균점수 입니다.");
						}
						break;
						
					}//수학점수
					else {
						System.out.println("0~100점 사이로 입력해주세요.\n");
					}
				}//영어점수
				else {
					System.out.println("0~100점 사이로 입력해주세요.\n");
				}
			}//국어점수
			else {
				System.out.println("0~100점 사이로 입력해주세요.\n");
			}
		}//반복문	
	}
}













//package com.javalec.base;
//
//import java.util.Scanner;
//
//public class ELSE02 {
//
//	public static void main(String[] args) {
//		int language = -1;
//		int english = -1;
//		int math = -1;
//		double mean = 0;
//		String languagestr = "";
//		String englishstr = "";
//		String mathstr = "";
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("국어 점수를 입력하시오");
//		while (language < 0 || language > 100) {
//			language = scanner.nextInt();
//
//			if (language < 0 || language > 100)
//				System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("영어 점수를 입력하시오");
//		while (english < 0 || english > 100) {
//			english = scanner.nextInt();
//
//			if (english < 0 || english > 100)
//				System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("수학 점수를 입력하시오");
//		while (math < 0 || math > 100) {
//			math = scanner.nextInt();
//
//			if (math < 0 || math > 100)
//				System.out.println("잘못된 값입니다.");
//		}
//
//		mean = (language + math + english) / 3.0;
//
//		if (language > mean) {
//			languagestr = "보다 큽니다.";
//		} else if (language < mean) {
//			languagestr = "보다 작습니다.";
//		} else if (language == mean) {
//			languagestr = "과 같습니다.";
//		}
//
//		if (english > mean) {
//			englishstr = "보다 큽니다.";
//		} else if (english < mean) {
//			englishstr = "보다 작습니다.";
//		} else if (english == mean) {
//			englishstr = "과 같습니다.";
//		}
//
//		if (math > mean) {
//			mathstr = "보다 큽니다.";
//		} else if (math < mean) {
//			mathstr = "보다 작습니다.";
//		} else if (math == mean) {
//			mathstr = "과 같습니다.";
//		}
//
//		System.out.println("평균: " + mean);
//		System.out.println("국어 점수는 평균" + languagestr);
//		System.out.println("영어 점수는 평균" + englishstr);
//		System.out.println("수학 점수는 평균" + mathstr);
//
//	}
//
//}
