package section13_LiveClasses;

public class Static_Keyword_Example7 {
	
	/* Static block we can consider is as constructor */
	/* Static Block / Static Member execute at the time of class loading.*/
	static {
		System.out.println("This is static block...");
		
	}
	public Static_Keyword_Example7() {
		System.out.println("This is constructor...");
	}
}
