package section13_LiveClasses;
/* If we want to make the variable as constant we can use final keyword.
 * If u r using the final keyword in class means it's a final class which cannot be inherited*/
public class Final_Keyword_Example1 {
	
	int i=10;
	
	public final void sumMethod(int a,int b) {
		System.out.println("The sum of a & b is "+a+b);
	}
}
