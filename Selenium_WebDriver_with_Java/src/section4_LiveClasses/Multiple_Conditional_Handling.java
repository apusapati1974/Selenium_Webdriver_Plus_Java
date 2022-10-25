package section4_LiveClasses;
/*
 *  Take 1 integer as an argument
 *  If number is neagtive, we need to print its a negative number
 *  If number is zero, we need to print its a zero
 *  If number is Positive, we need to print its a Positive number
 */
public class Multiple_Conditional_Handling {
	public void data(int a) {
		if(a<0) {
			System.out.println("This is Negative Number...");
		}
		else if(a==0) {
			System.out.println("This is Zero...");
		}
		else if(a%2==0) {
			System.out.println("This is Even Number...");
		}
		else {
			System.out.println("This is Odd Number...");
		}
	}
	public static void main(String[] args) {
		Multiple_Conditional_Handling mch = new Multiple_Conditional_Handling();
		mch.data(-2);
		mch.data(0);
		mch.data(2);
		mch.data(5);
	}
}
