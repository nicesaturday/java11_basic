package org.kh.java;



public class Variable3 {
	public static void main(String[] args) {
		int bin = 0b10111;
		int oct = 01011;
		int dec = 3650;
		int hex = 0x2254;
		System.out.println("bin="+bin);
		System.out.println("oct="+oct);
		System.out.println("dec="+dec);
		System.out.println("hex="+hex);
		System.out.println(Integer.toBinaryString(dec));
		System.out.println(Integer.toHexString(bin));
		System.out.printf("bin = %o",bin);
	}
}
