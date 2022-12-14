package section13_LiveClasses;

public class This_Keyword_Example5 {
	
	int i;
	
	public void printData() {
		System.out.println("Testing World...");
	}
	
	public void TestingMethodName() {
		/*
		 * Two approches need to implement.
		 * Approch - 1:
		 *    >> here i am creating my own class object and calling the printData Method. 
		 * here i want to call our own class with other member.
		 * This_Keyword_Example5 tk5 = new This_Keyword_Example5();
		 * tk5.printData();
		 */
		this.printData();
	}
}	
