package section11_LiveClasses;

public class MultilevelInherit_B extends MultilevelInherit_A{
	public void method_2(int a,int b) {
		System.out.println("This is Parent Class - B");
		int sub = a-b;
		System.out.println(sub);
	}
}
