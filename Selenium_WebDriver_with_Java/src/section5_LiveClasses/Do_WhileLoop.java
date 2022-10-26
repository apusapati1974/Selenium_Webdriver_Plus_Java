package section5_LiveClasses;
// Printing 8 table
public class Do_WhileLoop {
	
	public void doWhileLoop(int a) {  // Entry control loop.
		int j = 1;
		do {
			System.out.println(a+" * "+j+" = "+a*j);
			j++;
		}while(j<=10);
	}
	public static void main(String[] args) {
		Do_WhileLoop dwl = new Do_WhileLoop();
		dwl.doWhileLoop(8);
	}
}
