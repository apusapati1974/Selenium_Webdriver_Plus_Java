package section12_LiveClasses;

public class This_Keyword_Example1 {
	
	int i=10;  // Global Variable.
	/*
	 * Condition : if i have a same name & different value then it will call the local variable.
	 */
	public void printVariable() {
		int i = 20;  // Local Variable.
		System.out.println(i);
	}
}
