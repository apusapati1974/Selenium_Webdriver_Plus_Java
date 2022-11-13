package section11_LiveClasses;

public class Inherit_B extends Inherit_A{
	
	public void mul(int a,int b) {
		int mul = a*b;
		System.out.println("Mul  is "+mul);
	}
	public void div(int a,int b) {
		int div = a/b;
		System.out.println("Div is "+div);
	}
}
