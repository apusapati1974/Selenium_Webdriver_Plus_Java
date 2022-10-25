package section3_Pratice_Examples;
/*
 *  Program Statement - Number Swapping
 *  Exchange value stored in 2  variables
 *  2 Approches 
 *  1. Using 3rd variable
 *  2. Without using Third variable
 */
public class Exercise_4 {
	public static void main(String[] args) {
		/*
		// with using Third Variable
		int a = 100;
		int b = 200;
		int c = a;  // Third Variable c = 100
		a=b;       // a = 200
		b=c;       // b = 100
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		*/
		
		// Without using Third variable
		int a = 100;
		int b = 200;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		
	}
}
