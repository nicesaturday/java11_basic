package sec2;

public class Subway {
	int no;
	String station;
	int money;
	int cnt;
	
	public Subway(int no) {
		this.no = no;
	}
	
	public void take(int money) {
		this.money += 1500;
		cnt++;
	}
	
	public void print() {
		System.out.println("지하철 "+this.no+"호선"+" "+"승객수 : "+this.cnt+"명"+" "+"수입 : "+this.money);
	}
}
