package section12_LiveClasses;

public class Super_Keyword_Example2 extends Super_Keyword_Example1{
	
	int i=20;
	
	public void parentMethod() {
		System.out.println("This is Child Method...");
	}
	public void testing() {
		int i=1000;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}