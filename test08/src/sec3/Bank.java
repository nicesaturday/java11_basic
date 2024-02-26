package sec3;

public class Bank {
	private String name;
	private int number;
	private int money;
	private Master master;
	
	public Bank(String name, int number , Master master ) {
		super();
		this.name = name;
		this.number = number;
		this.master = master;
	}
	
	public int inMoney(int money) {
		master.getTotalMoney() -= money;
		return this.money += money;
	}
	
	public int outMoney(int money) {
		this.master.getTotalMoney() -= money;
		return this.money -= money;
	}
	
	public String print() {
		return this.name+" "+this.master+" "+this.number+" "+this.money;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", number=" + number + ", money=" + money + "]";
	}
	
	
}
