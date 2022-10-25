package section4_CodingExercises;
/*
 *  Problem Description - 
 *    Number Divisible
 */
public class Code_2 {
	
	public void divisible(int num) {
		if(num%8 == 0 && num%12 == 0) {
			System.out.println("Number "+num+" is divisible by both 8 & 12.");
		}
		else if(num%8 == 0) {
			System.out.println("Number "+num+" is divisible by only 8.");
		}
		else if(num%12 == 0) {
			System.out.println("Number "+num+" is divisible by only 12");
		}
		else {
			System.out.println("Number "+num+" is not divisible by both 8 & 12");
		}
	}
	
	public static void main(String[] args) {
		Code_2 c = new Code_2();
		c.divisible(48);
		c.divisible(16);
		c.divisible(108);
		c.divisible(5);
	}

}
