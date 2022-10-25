package section4_LiveClasses;
/*
 *  Nested Conditions - 
 *    we need to check if number is greater than zero & check even or odd
 */
public class Nested_Condition_Handling {
	public void nested(int a) {
		if(a>0) {
			if(a%2==0) {
				System.out.println("This is even number");
			}
			else {
				System.out.println("This is odd number");
			}
		}
	}
	public static void main(String[] args) {
		Nested_Condition_Handling nch = new Nested_Condition_Handling();
		nch.nested(2);
	}
}
