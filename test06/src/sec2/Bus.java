package sec2;

public class Bus {
    private int no;
    private int cnt;
    private int money;
	
	public Bus(int no) {
		this.no = no;
	}

	
	public Bus(int no, int cnt, int money) {
		this.no = no;
		this.cnt = cnt;
		this.money = money;
	}
	
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	public void print() {
		System.out.println("버스 : "+this.no+" "+"승객수 : "+this.cnt+"명"+" "+"수입 : "+this.money);
	}
	
}
