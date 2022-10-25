package section4_LiveClasses;
/*
 *  Conditional handling using Logical OR, AND
 *  Conditional handling with Nested Conditions
 *  Problem Description :-  
 *     Method which will take 1 integer as argument
 *     Number which is divisible by both 5 & 7
 *     Number which is divisible by 5 only, Number which is divisible by 7 only
 *     Number which is not divisible by both 7 & 5 
 */
public class ConditionalHandling_Logic {
	public void divisible(int a) {
//		if(a%7 == 0 && a%5 == 0) {		// Logical AND Operator	
//			System.out.println("Numbers are divisible by both 5 & 7...(AND)");
//		}
		if(a%7 == 0 || a%5 == 0) {
			System.out.println("Numbers are divisible by both 5 & 7...(OR)");
		}
		else if(a%7 == 0) {
			System.out.println("Numbers are divisible by only 7...");
		}
		else if(a%5 == 0) {
			System.out.println("Numbers are divisible by only 5...");
		}
		else {
			System.out.println("Numbers are not divisible by both 5 & 7...");
		}
	}
	public static void main(String[] args) {
		ConditionalHandling_Logic chl = new ConditionalHandling_Logic();
//		chl.divisible(35);
		chl.divisible(3);
//		chl.divisible(15);
//		chl.divisible(3);
	}
}
