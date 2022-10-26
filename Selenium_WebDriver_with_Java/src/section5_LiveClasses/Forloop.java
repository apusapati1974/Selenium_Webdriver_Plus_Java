package section5_LiveClasses;
/*
 *  First 10 Natural numbers
 */
public class Forloop {
	
	public void naturalNumbers() {
		System.out.println("The First 10 Natural Numbers are - ");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public void revNaturalNumbers() {
		System.out.println("The First 10 Natural Numbers in reverse order - ");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Forloop loop = new Forloop();
		loop.naturalNumbers();
		System.out.println("\n");
		loop.revNaturalNumbers();
	}

}
