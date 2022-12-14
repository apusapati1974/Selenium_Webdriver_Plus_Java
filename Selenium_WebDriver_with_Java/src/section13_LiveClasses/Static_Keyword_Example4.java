package section13_LiveClasses;

public class Static_Keyword_Example4 {
	
	public static void main(String[] args) {
		
		Static_Keyword_Example3 obj1 = new Static_Keyword_Example3();
		obj1.a = 100;
		
		// I am accessing the value of variable a.
		Static_Keyword_Example3 obj2 = new Static_Keyword_Example3();
		System.out.println(obj2.a); // result should be a=0
		/*
		 *  Code Explanation : 
		 *   If my class member is non-static means Instance member. Instance member allocate seperate 
		 *   memory location for each of the object.
		 */
	}
}
