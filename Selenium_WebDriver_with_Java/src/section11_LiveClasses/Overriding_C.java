package section11_LiveClasses;

public class Overriding_C {
	
	public static void main(String[] args) {
		
		Overriding_B b = new Overriding_B();
		b.sub(10, 3);
		b.div(20, 2);
		b.sum(10, 5); // calling the overriden method 
	}
}
