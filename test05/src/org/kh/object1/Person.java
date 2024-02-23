package org.kh.object1;

public class Person {
	private String name;
	private int age;
	private String job;
	private String gender;
	public Person(String name, int age, String job, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
	}
	
	public void eating() {
		System.out.printf("%s가밥을 먹습니다.", this.name);
	}
	
	
}
