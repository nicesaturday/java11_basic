package sec1;

public class Book {
	String author;
	String name;
	public Book(String author, String name) {
		super();
		this.author = author;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", name=" + name + "]";
	}
	
	
}
