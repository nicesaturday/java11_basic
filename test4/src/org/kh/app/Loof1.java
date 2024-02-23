package org.kh.app;

public class Loof1 {
	public static void main(String[] args) {
		
		
//		for(var i = 0; i < 13; i++) { //13개. 홀수로 지정 그래야 대칭//
//	
//			if(i < 7) { // 가운데를 나누자
//			for(var j = 0; j < 6-i; j++) { //빈칸이 하나씩 사라짐 중간 보다 하나 낮음
//				System.out.print(" ");   //꾸준히 증가하는 값은 i밖에 없다.
//			}
//			for(var j = 0; j < i * 2 + 1 ; j++) {
//				System.out.print("*");  //단순한 +2 DP
//			}
//			System.out.println();
//		    }else {
//		    	for(var j = 0; j < i - 6 ; j++){
//		    		System.out.print(" ");  //반대로 적용 빈칸이 1부터 늘어남
//		    	}
//		    	for(var j = 0; j <  24 -( i * 2 - 1) ; j++) {
//		    		System.out.print("*"); // DP로 i를 이용해서 2씩 차이나게 
//		    		                       // 뺴준다. 24는 계산해서 빼주자
//		    	}
//		    	System.out.println();
//		    }
//		}
		
		
		
		
		for(var i = 0; i < 15; i++) {
			if(i < 7) {
				for(var j = 0; j < 6-i; j++) {
					System.out.print(" ");
				}
				for(var j = 0; j < (i * 2 + 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(var j = 0; j < i-6; j++) {
					System.out.print(" ");
				}
				for(var j = 0; j < 24 - (i * 2 - 1); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
