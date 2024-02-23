package org.kh.object1;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	int test;

	
	public void address() {
		System.out.println(System.identityHashCode(test));
	}
	
	
	int tot() {
		return this.kor+this.eng+this.mat;
	}
	
	
	public float avg() {
		
		return tot() / 3.0f;
	}
	
	public void resulting() {
		System.out.printf("\n%s의 총점 : %d",this.name,tot());
		System.out.printf("\n%s의 평균 : %.3f\n",this.name,avg());
	}
}
