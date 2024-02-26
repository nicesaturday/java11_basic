package sec2;

public class StudentEx {
	public static void main(String[] args) {
		Student2 stu1 = new Student2("이원석",2,30000);
		
		Bus bus = new Bus(101);
		
		stu1.takeBus(bus);
		stu1.takeBus(bus);
		
		Subway subway = new Subway(2);
		for(var i = 0; i < 3; i++) {
			stu1.takeSubway(subway);
		}
		
		
		bus.print();
		subway.print();
		
		System.out.println();
	}
}
