package section13_LiveClasses;

public class Static_Keyword_Example1 {
	
	int a=0;
	public static void getdata() {
		System.out.println("This is Static Method...");
	}
	public void getData() {
		System.out.println("This is Non-static / It's Instance Method...");
		System.out.println("The value of a is "+a);
	}
}
