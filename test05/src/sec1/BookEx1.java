package sec1;

import sec2.Board;

public class BookEx1 {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.setBno(123);
		book1.setBname("데미안");
		book1.setPrice(5000);
		book1.setPub("한빛");
		book1.setAuthor("샹클리에");
		
		
		book1.print();
		Book.print(book1.getBname(), book1.getPrice(), book1.getAuthor());
		
		
		
		Board board = new Board();
		
		System.out.println();
	}
}
