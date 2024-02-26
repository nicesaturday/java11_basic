package sec3;

import java.util.Scanner;

public class BankExam {
	public static void main(String[] args) {
		
		Master master = new Master("김민식", 20000);
		
		Bank bank1 = new Bank("국민은행",11001,master);
		Bank bank2 = new Bank("기업은행",10011,master);
		Bank bank3 = new Bank("농협은행",10001,master);
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("계좌번호와 입금액을 입력하세요. : ");
			scan.nextInt();
			scan.nextInt();
			System.out.print("계좌번호와 출금액을 입력하세요. : ");
			
			System.out.print("계좌번호를 입력하세요. : ");
		}
	}
}
