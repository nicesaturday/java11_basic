package org.kh.app;

import java.util.Scanner;

public class Condition4 {
	 public static void main(String[] args) {
		 
//		Scanner scan = new Scanner(System.in);
//		System.out.print("점수 입력[0~100] : ");
//		int point = scan.nextInt();
//		String result;
//		String award;
		
//		if(97 <= point && point <= 100) result = "A++";
//		else if(93 <= point && point <= 96) result = "A0";
//		else if(90 <= point && point <= 92) result = "A-";
//		else if(87 <= point && point <= 89) result = "B++";
//		else if(83 <= point && point <= 86) result = "B0";
//		else if(80 <= point && point <= 82) result = "B-";
//		else if(77 <= point && point <= 79) result = "C++";
//		else if(73 <= point && point <= 76) result = "C0";
//		else if(70 <= point && point <= 72) result = "C-";
//		else if(67 <= point && point <= 69) result = "D++";
//		else if(63 <= point && point <= 66) result = "D0";
//		else if(60 <= point && point <= 62) result = "D-";
//		else result = "F";
		
		
		/*
		 * switch(result) { case "A++" : award = "학업우수상"; break; case "A0" : award =
		 * "노력상"; break; case "A-" : award = "아차상"; break; default : award = ""; }
		 */
		 
		/*
		 * System.out.printf("당신의 하점 : %s" , result); System.out.printf("\t당신의 학점 : %s"
		 * , award);
		 */
		 
		//haha
		
		
		 
		System.out.print("점수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		
		String MARK = "";
		String AWARD = "";
		
		
		if(score >= 90) {
			MARK += "A";
			if(score % 10 >= 7 || score == 100) {
				MARK += "+"; AWARD += "최우수"; 
			}
			else if(score % 10 >= 4) {
				MARK += "0"; AWARD += "우수";
			}
			else {
				MARK += "-"; AWARD += "노력";
			}
		}else if(score >= 80) {
			MARK += "B";
			if(score % 10 >= 7) MARK += "+";
			else if(score % 10 >= 4) MARK += "0";
			else MARK += "-";
		}
		
		
		
		
		
		
		System.out.printf("당신의 점수는 : %s" , MARK);
		System.out.printf("\n수상 : %s", AWARD);
		
		
		
		
		}
}
