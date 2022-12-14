package section13_LiveClasses;

public class Static_Keyword_Example5 {
	
	static int a = 0;  // Static Member
	int b = 100;       // Instance Member.
	/* Instance Method can access any of the variable or class variable does not matter.*/
	// Creating an non-static method
	public void displayData() {
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	/* Static Method can access only members which are static */
	public static void displaydata() {
		System.out.println("The value of a is "+a);
		
	}
}
