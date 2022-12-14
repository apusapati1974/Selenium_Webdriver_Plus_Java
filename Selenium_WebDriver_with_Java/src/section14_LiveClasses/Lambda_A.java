package section14_LiveClasses;

public class Lambda_A {
	
	public static void main(String[] args) {
		
		// Lambda Expression for functional Interface.
		Interface_I obj = (a,b)->a+b; // Functional Interface.
		int sum = obj.sum(10, 20);
		System.out.println("The Sum is "+sum);
	}
}	
