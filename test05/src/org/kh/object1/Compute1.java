package org.kh.object1;

public class Compute1 {
	
	
	int a = 8;
	
	void printHAha() {
		System.out.println("haha");
	}
	
	void printAAddB(int a,int b) {
		System.out.println(System.identityHashCode(a+b));
		System.out.println(System.identityHashCode(this.a));
	}
}
