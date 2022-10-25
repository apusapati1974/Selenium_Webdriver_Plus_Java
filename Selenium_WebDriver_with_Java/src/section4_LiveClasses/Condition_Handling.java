package section4_LiveClasses;
/*
 * Prime Numbers using the methods
 */
public class Condition_Handling {
	public void evenodd(int eo) {
		if(eo%2 == 0) {
			System.out.println("This is Prime Number");
		}
		else {
			System.out.println("This is not Prime");
		}
	}
	public static void main(String[] args) {
		Condition_Handling ch = new Condition_Handling();
		ch.evenodd(2);
	}

}
