package org.kh.app2;

import java.util.HashSet;
import java.util.Random;


public class Loop8 {
	public static void main(String[] args) {
		
		//별
		
		
		
		
		
//		for(var i = 7; i > 0; i--) {
//			for(var j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
//		
//		
//		for(var i = 1; i < 5; i++) {
//			
//			for(var j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(var k = 0; k < i * 2 - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//         for(var i = 1; i < 8; i++) {
//			
//        	 
//        	if(i < 5) {
//			for(var j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			
//			for(var k = 0; k < i * 2 - 1; k++) {
//				System.out.print("*");
//			}
//		        System.out.println();
//        	}else {
//        		for(var j = 4; j < i; j++) {
//    				System.out.print(" ");
//    			}
//    			
//    			for(var k = 0; k < 8 - (i * 2) - 1; k++) {
//    				System.out.print("*");
//    			}
//    			System.out.println();
//        	}
//		}
         
         
         
         
         
         
         for(var i = 0; i < 8; i++) {
        	 if(i < 5) {
        	 for(var j = 5; j > i; j--) {
        		 System.out.print(" ");
        	 }
        	 for(var j = 0; j < i * 2 + 1; j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
        	 }else {
        		 for(var j = 0; j < i - 2; j++) {
        			 System.out.print(" ");
        		 }
        		 for(var j = 0; j < 16 - (i * 2 + 1); j++) {
        			 System.out.print("*");
        		 }
        		 System.out.println();
        	 }
         }

	}
}
