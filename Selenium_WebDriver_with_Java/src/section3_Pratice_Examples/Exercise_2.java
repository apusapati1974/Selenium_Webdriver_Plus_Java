package section3_Pratice_Examples;
/*
 * Perform the following Calculation (Square 2)+(Square 5)
 */
public class Exercise_2 {
	public int square(int a) {
		int s = a*a;
		return s;
	}
	public void sum(int a,int b) {
		int z= a+b;
		System.out.println("The sum of the square : "+z);
	}
	public static void main(String[] args) {
		Exercise_2 e2 = new Exercise_2();
		int s1 = e2.square(2);
		int s2 = e2.square(5);
		e2.sum(s1, s2);
	}
}
