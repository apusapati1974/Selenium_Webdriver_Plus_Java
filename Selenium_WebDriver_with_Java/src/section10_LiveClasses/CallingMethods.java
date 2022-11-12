package section10_LiveClasses;

public class CallingMethods {
	
	public static void main(String[] args) {
		
		Public p = new Public();
		p.method1();
		
		Private p1 = new Private();
		p1.method2();
		
		Default d = new Default();
		d.defaultmethod();
		d.method1();
		d.method2();
	}
	
}
