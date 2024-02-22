package org.kh.app;

public class Condition {
	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		
		if(point >= 70) pass = "합격";
		
		
		System.out.printf("당신의 결과는 %s입니다.",pass);
	}
}
