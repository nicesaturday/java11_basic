package sec2;

import java.util.Date;

public class NoticeEx1 {
	public static void main(String[] args) {
		
		Date date = new Date();
		
		Notice notice = new Notice(1, date.getDate(), "치킨", "홍대");
		
		System.out.println(notice.toString());
	}
}
