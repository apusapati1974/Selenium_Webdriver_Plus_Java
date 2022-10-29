package section6_LiveClasses;

public class String_Functions3 {
	
	String s = "This is Anudeep";
	String s1 = "This is Anudeep";
	String s2 = "This IS Anudeep";
	
	public void stringHandle() {
		
		// Comparing the two string is equal or not.
		System.out.println("-----Equal Case-----");
		if(s.equals(s1)) {
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are not equal");
		}
		
		System.out.println("-----Not Equal Case-----");
		if(s.equals(s2)) {
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are not equal");
		}
		
		System.out.println("-----Equal IgnoreCase-----");
		if(s.equalsIgnoreCase(s2)) {
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are not equal");
		}
		
		System.out.println("-----Without using Equal IngoreCase-----");
		if(s.toUpperCase().equals(s2.toUpperCase())) {
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are not equal");
		}
	}
	
	public static void main(String[] args) {
		String_Functions3 sf = new String_Functions3();
		sf.stringHandle();
	}

}
