package section3_Pratice_Examples;
/*
 * Perform following Calculation (2+3)*(5-2)
 * Using Methods 
 */
public class Exercise_1 {
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c = a-b;
		return c;
	}
	public void mul(int a,int b) {
		int c = a*b;
		System.out.println("The Result is "+c);
	}
	public static void main(String[] args) {
		Exercise_1 e1 = new Exercise_1();
		int sumresult = e1.sum(10, 20);
		int subresult = e1.sub(5, 2);
		e1.mul(sumresult, subresult);
	}
}
