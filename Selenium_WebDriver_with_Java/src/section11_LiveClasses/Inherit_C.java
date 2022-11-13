package section11_LiveClasses;

public class Inherit_C {
	
	public static void main(String[] args) {
		
		Inherit_B b = new Inherit_B();
		System.out.println("!---Mul is---!");
		b.mul(10, 8);
		System.out.println("!---Div is---!");
		b.div(20, 5);
		System.out.println("!---Sub is---!");
		b.sub(10, 5);
		System.out.println("!---Sum is---!");
		b.sum(10, 10);
	}
}
