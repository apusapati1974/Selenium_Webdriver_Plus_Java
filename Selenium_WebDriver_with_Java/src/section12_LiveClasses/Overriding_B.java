package section12_LiveClasses;

public class Overriding_B extends Overriding_A{
	
	@Override
	public void sum(int a,int b) {
		System.out.println(a*a+b*b);
	}
	
	public void div(int a,int b) {
		System.out.println(a/b);
	}
}
