package org.kh.app;

import java.util.Scanner;

public class Condition3 {
	 public static void main(String[] args) {
		 
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("점수 입력[0~100] : ");
		 int point = scanner.nextInt();
		 String mark = scanner.next();
		 System.out.printf("\n당신의 점수는 %5d 점 입니다.",point);
		 System.out.printf("\n당신의 점수는 %s 점 입니다.",mark);
    }
}
