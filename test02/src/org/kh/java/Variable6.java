package org.kh.java;

public class Variable6 {
	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.15;
		int kor = 90, ehg = 80, mat = 90;
		
		float avg = (float)(kor + ehg + mat) / 3;
		
		System.out.printf("\nf1=%.3f",f1);
		System.out.printf("\nf1=%.100f",f2);
		System.out.printf("\n평균 : %.3f", avg);
	}
}
