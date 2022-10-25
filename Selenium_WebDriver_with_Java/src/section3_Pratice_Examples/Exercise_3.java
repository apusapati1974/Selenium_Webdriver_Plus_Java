package section3_Pratice_Examples;

public class Exercise_3 {
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	public void mul(int a,int b) {
		int c = a*b;
		System.out.println("The Result is - "+c);
	}
	public static void main(String[] args) {
		Exercise_3 e3 = new Exercise_3();
		int sum1 = e3.sum(2, 5);
		int sum2 = e3.sum(2, 5);
		int sum3 = e3.sum(sum2, 7);
		e3.mul(sum1, sum3);
	}
}
