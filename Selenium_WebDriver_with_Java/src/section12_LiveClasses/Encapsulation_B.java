package section12_LiveClasses;

public class Encapsulation_B {
	
	public static void main(String[] args) {
		
		Encapsulation_A obj = new Encapsulation_A();
		System.out.println("!---Setter value of Id as 100----!");
		obj.setId(100);
		System.out.println("Getting the value of Id is "+obj.getId());
	}
	
}
