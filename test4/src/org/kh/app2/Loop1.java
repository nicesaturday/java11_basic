package org.kh.app2;

public class Loop1 {
	public static void main(String[] args) {
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		String[] names = {"김","이","박","최","정","오","배","강","장","계"};
		
		int total = 0; 
		float rev = 0;
		
		
		System.out.printf("이름\t점수\t학점\t판정\n");
		for(int i = 0; i < 10; i++) {
			total += nums[i];
			System.out.printf("%s\t%d\t", names[i] ,nums[i]);
			if(nums[i] >= 90) System.out.printf("%s\t%s\n", "A" , "합격");
			else if(nums[i] >= 80)System.out.printf("%s\t%s\n", "B", "합격");
			else if(nums[i] >= 70)System.out.printf("%s\t%s\n", "C" , "합격");
			else System.out.printf("%s\t%s\n", "D" , "불합격");
		}
		
		rev = (total / 10.0f); //평
		
		
		
		int max = 0 , min = 100;
		
		for(int x : nums) {
			if(x >= max) max = x;
			if(x <= min) min = x;
		}
		
		
		
		
		System.out.printf("평균 : %.1f", rev);
		System.out.printf("\n최고 점 : %d",max);
		System.out.printf("\n최하 점 : %d", min);
		System.out.println("\n"+nums+"\n"+names);
		
		
		System.out.println(System.identityHashCode(33L));
		long b = 33L;
		long c = 34L;
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
	}
}
