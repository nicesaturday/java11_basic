package org.kh.java;

public class Variable7 {
	public static void main(String[] args) {
		String name = "김민식";
		Integer age =200;
		float height = 340.67f;
		boolean pass = true;
		double weight = 13.5;
		
		String height2 = "12.14";
		double h = Double.parseDouble(height2);
		float height3 = Float.parseFloat(height2);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("name : "+age.getClass().getName());
		System.out.println(h);
	}
}
