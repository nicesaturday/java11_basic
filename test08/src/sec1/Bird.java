package sec1;

public class Bird extends Animal {
	private int wings;

	public Bird(int wings) {
		super(2,true);
		this.wings = wings;
	}
	

	public void print() {
		System.out.printf("%d %b %d",super.getLeg(),super.isSpine(),wings);
	}
	
	public static void main(String[] args) {
		
		Bird bird = new Bird(3);
		bird.print();
	}
}
