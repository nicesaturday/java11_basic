package sec1;

public class BirthdayExam1 {
	public static void main(String[] args) {
		Birthday birthday = new Birthday();
		
		birthday.setDay(9);
		birthday.setName("김민식");
		birthday.setMonth(9);
		birthday.setYear(1997);
		birthday.birth();
		birthday.birthAddr();
		
		
		Birthday birthday2 = new Birthday();
		
		birthday2.setDay(30);
		birthday2.setName("신금섭");
		birthday2.setMonth(11);
		birthday2.setYear(1943);
		birthday2.birth();
		birthday2.birthAddr();
	}
}
