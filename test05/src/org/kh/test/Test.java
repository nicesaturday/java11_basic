package org.kh.test;

import org.kh.object1.Member;

public class Test {
	public static void main(String[] args) {
        Member member = new Member();
		
		member.setId("nicesaturday");
		member.setEmail("nucesaturday@github.com");
		member.setBirth(97);
		member.setTel(12412);
		
		
		System.out.println(member.getEmail());
		System.out.println(member.toString());
	}
}
