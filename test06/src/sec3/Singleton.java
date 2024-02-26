package sec3;

public class Singleton {

	private static Singleton inter;
	private Singleton() {};
	public static synchronized Singleton getInter() {
		if(inter == null) inter = new Singleton();
		return inter;
	}
	
}
