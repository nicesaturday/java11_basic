package sec2;

import java.util.Date;

public class Notice {
	private int id;
	private int day;
	private String todo;
	private String place;
	
	public Notice(int id, int day, String todo, String place) {
		this.id = id;
		this.day = day;
		this.todo = todo;
		this.place = place;
	}
	
	
	public static void print() {
		System.out.println("hi~");
	}

	@Override
	public String toString() {
		System.out.println("hi");
		return "Notice [id=" + id + ", day=" + day + ", todo=" + todo + ", place=" + place + "]";
	}
	
	
	
	
	
	
}
