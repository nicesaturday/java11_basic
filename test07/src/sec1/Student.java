package sec1;

public class Student {
	private int number;
	private int kor;
	private int eng;
	private int mat;
	
	
	public Student() {};
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	public int total() {
	
		return this.eng + this.kor + this.mat;
	}
	
	public float rev() {
	
		return (this.eng + this.kor + this.mat) / 3.0f;
	}
	
	public String rank() {
		String a = "";
		if(rev() >= 90) a += "A";
		else if(rev() >= 80) a += "B";
		else if(rev() >= 70) a += "C";
		else if(rev() >= 60) a += "D";
		else a += "F";
		return a;
	}


	public String toString() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%s\t\n",
				this.getNumber(),
				this.getKor(),
				this.getEng(),
				this.getMat(),
				this.total(),
				this.rev(),
				this.rank()
				);;
		return "Student [number=" + number + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	
}
