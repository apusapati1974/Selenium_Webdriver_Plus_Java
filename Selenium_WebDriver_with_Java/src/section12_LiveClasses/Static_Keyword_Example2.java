package section12_LiveClasses;

public class Static_Keyword_Example2 {
	public static void main(String[] args) {
		Static_Keyword_Example1 st1 = new Static_Keyword_Example1();
		/* In another way we can access the class members(methods / variables) */
		st1.a = 100;  // That is the value of Instance method.
		Static_Keyword_Example1.getdata();
		st1.getData();
	}
}	
