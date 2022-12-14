package section13_LiveClasses;

public class This_Keyword_Example3 {
	
	int i;
	
	public void printlocalVariable(int i) {
		// This.i - is the Global Variable.
		this.i=i;
		System.out.println("Passing the local Variable..."+i);
	}
}
