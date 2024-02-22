package org.kh.app2;

import java.util.Scanner;

public class Loop6 {
	public static void main(String[] args) {
		
		//숫자 맞추기 게임
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int quiz = (int) (Math.random() * 100);
		
		
		while(true) {
			System.out.print("값을 입력하세요.[0~100] : ");
			int userNumber = scan.nextInt();
			
			if(userNumber > quiz) System.out.println("틀렸습니다. down");
			else if(userNumber < quiz) System.out.println("틀렸습니다. up");
			else if(userNumber == quiz) break;
			
		}
		
		System.out.println("축하합니다.");

	}
}
