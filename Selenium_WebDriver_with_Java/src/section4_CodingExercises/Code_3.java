package section4_CodingExercises;

// Problem Description - Days in a month.

public class Code_3 {
	public void daysInMonth(int num) {
		if(num > 12 || num < 1) {
			System.out.println("Invalid Month...");
		}
		else if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
			System.out.println("Month has 31 days...");
		}
		else if(num == 4 || num == 6 || num == 9 || num == 11) {
			System.out.println("Month has 30 days...");
		}
		else if(num == 2) {
			System.out.println("Month has 28 or 29 days...");
		}
	}
	public static void main(String[] args) {
		Code_3 c  = new Code_3();
		c.daysInMonth(5);
		c.daysInMonth(2);
		c.daysInMonth(6);
	}
}
