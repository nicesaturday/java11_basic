package sec1;

public class BookExam {
	public static void main(String[] args) {
		
		Book[] book = new Book[100];
		
		book[0] = new Book("애덤 그런트1","싱크어게인1");
		book[1] = new Book("애덤 그런트2","싱크어게인2");
		book[2] = new Book("애덤 그런트3","싱크어게인3");
		book[3] = new Book("애덤 그런트4","싱크어게인4");
		book[4] = new Book("애덤 그런트5","싱크어게인5");
		
		for(var i = 0; i < 5; i++) {
			book[i].toString();
		}
	}
}
