package sec2;

import java.util.Date;

public class Notice {
	private int id;
	private int day;
	private String todo;
	private String place;
	private Board board;
	
	
	
	public Notice(int id, int day, String todo, String place, int bno , int visited) {
		this.id = id;
		this.day = day;
		this.todo = todo;
		this.place = place;
		this.board.setBno(bno);
		this.board.setVisited(visited);	
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
