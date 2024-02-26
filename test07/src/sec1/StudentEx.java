package sec1;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		
		Student[] arr = new Student[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			arr[i] = new Student();
			arr[i].setNumber(i+1);
			System.out.print((i+1)+"번째 국어 :");
			arr[i].setKor(scanner.nextInt());
			System.out.print((i+1)+"번째 수학 :");
			arr[i].setMat(scanner.nextInt());
			System.out.print((i+1)+"번째 영어 :");
			arr[i].setEng(scanner.nextInt());
		}
		
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균\t학점");
		
		for(int i = 0; i < 5; i++) {
			arr[i].toString();
		
		}
	}
	
}
