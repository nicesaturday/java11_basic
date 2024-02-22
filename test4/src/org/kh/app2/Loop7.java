package org.kh.app2;

import java.util.HashSet;
import java.util.Random;


public class Loop7 {
	public static void main(String[] args) {
		
		//로또
		
		
	
	
		int max = 45, min = 1;
		Random rn = new Random();
		
		int i = 0;
		while(i < 6) {
		int val = rn.nextInt(44)+1;
	

		System.out.println(val);
		i++;
		}
		
		while(true) {
			int val = rn.nextInt(44);
			System.out.println(val);
			if(val == 0) break;
		}
		
		

	}
}
