package org.kh.java;

public class Variable1 {
	public static void main(String[] args) {
		boolean a = true;
		byte b = -128;
		short c = 32767;
		char d = 'k';
		int e = 2345678;
		float f = 1.4f;
		long g = 2767814;
		double h = 2.55d;
		 
		System.out.println("byte : "+ Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short : "+ Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("char : "+ Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println("int : "+ Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("float : "+ Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("long : "+ Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("double : "+ Double.MIN_VALUE + "~" + Double.MAX_VALUE);
	}
}
