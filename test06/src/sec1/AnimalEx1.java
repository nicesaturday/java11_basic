package sec1;


class Animal {
    private String type;
    private String name;
    private int leg;
    private int wing;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type == "포유류") 	this.setLeg(4);
		if(type == "조류") this.setLeg(2);
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
   
    
    
    
}


public class AnimalEx1 {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		ani1.setType("조류");
		ani1.setName("독수리");
		ani1.setWing(2);
		
		System.out.println(ani1.toString());
		
		Animal ani2 = new Animal();
		ani2.setType("파충류");
		ani2.setName("아나콘다");
		ani2.setLeg(0);
		ani2.setWing(0);
		
		System.out.println(ani2.toString());
	}
}
