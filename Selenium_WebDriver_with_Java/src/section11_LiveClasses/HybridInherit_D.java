package section11_LiveClasses;

public class HybridInherit_D extends HybridInherit_B implements HybridInherit_C{
	// Class D became concreate class 
	public void method_A() {
		System.out.println("This is A - interface");
	}
	
	public void method_C() {
		System.out.println("This is C - interface");
	}
}
