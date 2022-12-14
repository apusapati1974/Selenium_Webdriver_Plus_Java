package section13_LiveClasses;

public class Super_Keyword_Example5 extends Super_Keyword_Example4{
	
	int i=200;
	public Super_Keyword_Example5(int a) {
		super(a);
		System.out.println("The value of a is "+a);
	}
	public void hello() {
		System.out.println("This is Child Class Method...");
	}
	public void testing() {
		super.hello();
	}
}
