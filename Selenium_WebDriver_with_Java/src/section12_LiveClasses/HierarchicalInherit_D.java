package section12_LiveClasses;

public class HierarchicalInherit_D {
	
	public static void main(String[] args) {
		
		// Calling the Parent Class - A with Child Class - B
		HierarchicalInherit_B b = new HierarchicalInherit_B();
		b.method_2();
		b.method_1();
		
		// Calling the Parent Class - A with Child Class - C
		HierarchicalInherit_C c = new HierarchicalInherit_C();
		c.method_3();
		c.method_1();
	}
	
}
