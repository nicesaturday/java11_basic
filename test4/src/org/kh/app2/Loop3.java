package org.kh.app2;

public class Loop3 {
	public static void main(String[] args) {
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		
		for(var i : nums) {
			if(i > 80) System.out.println("합격");
			else System.out.println("불합격");
		}
	}
}
