package section5_CodingExercises;

public class FibonacciSeries {
	public void Fibonacci() {
		int a=0;
		int b=1;
		System.out.print(a+" , "+b);
		while(a+b<100) {
			b = a+b;
			a = b-a;
			System.out.print(" , "+b);
		}
	}
	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		fs.Fibonacci();
	}
}
