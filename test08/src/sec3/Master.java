package sec3;

public class Master {
	private String name;
	private int totalMoney;
	
	
	public Master(String name , int totalMoney) { 
		this.name = name;
		this.totalMoney = totalMoney;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getTotalMoney() {
		return totalMoney;
	}


	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	
	
}
