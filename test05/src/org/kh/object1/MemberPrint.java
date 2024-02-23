package org.kh.object1;

public class MemberPrint {
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
