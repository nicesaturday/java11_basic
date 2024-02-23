package sec1;

public class OverloadEx1 {
	public static void main(String[] args) {
		Product product = new Product();
		
		product.call(50);
		product.call("컴퓨터");
	}
}
