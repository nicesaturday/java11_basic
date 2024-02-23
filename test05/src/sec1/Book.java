package sec1;

public class Book {

	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
	
	
	public void print() {
			System.out.println(this.bno);
	}
	
	public static void print(String name,int price,String author) {
		System.out.printf("교재명 : %s\n가격 : %d\n저자 : %s",name,price,author);
	}

}
