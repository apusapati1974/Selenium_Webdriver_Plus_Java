package section14_LiveClasses;

public interface Interface_A {
	
	//public void testing();  // This is abstract method.
	
	static void method1() {
		System.out.println("This is Static Method in Interface");
	}
	
	default void testing() {
		System.out.println("This is Default Method in Interface");
	}
}
