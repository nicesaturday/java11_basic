package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentEx2 {

	public static void main(String[] args) {
		List<Student> arr = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		
		for(var i = 0; i < 5; i++) {
			Student student = new Student();
			System.out.println("국어 : ");
		    student.setKor(scan.nextInt());
			System.out.println("수학 : ");
			student.setMat(scan.nextInt());
			System.out.println("영어 : ");
			student.setEng(scan.nextInt());
			arr.add(student);
		}
		
		System.out.println(arr[0]);
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균\t학점");
		
		for(var s  : arr) {
			s.toString();
		}
	}
	
}
