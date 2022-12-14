package section12_LiveClasses;

public class Overloading_A {
	
	public void sum(int a,int b) {
		int sum = a+b;
		System.out.println("The Integer type of sum is "+sum);
	}
	
	public void sum(float a,float b) {
		float sum = a+b;
		System.out.println("The Float type sum is "+sum);
	}
	
	public void sum(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("The Integer type sum is "+d);
	}
	
}
