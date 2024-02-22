package org.kh.app2;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		
	;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = scan.nextInt();
		
		
		for(var i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n",n , i,n*i);
		}
		
		int a = 0;
		
		while(a < 9) {
			a++;
			System.out.printf("%d * %d = %d\n", n , a , n *a);
			
		}
		
		
	}
}
