package section6_LiveClasses;

public class String_Functions {
	
	String s = "Anudeep";
	String s1 = " Anudeep ";
	public void stringFunctions() {
		
		int strlen = s.length();
		System.out.println("The length of the String is - "+strlen);
		
		int space = s1.length();
		System.out.println("The length of string with space - "+space);
		
		int trim = s1.trim().length();
		System.out.println("After Triming the length of the string is -"+trim);
		
		String uppercase = s.toUpperCase();
		System.out.println("UpperCase String is - "+uppercase);
		
		String lowercase = s.toLowerCase();
		System.out.println("Lower Case String is - "+lowercase);
		
		System.out.println("The index of character is - "+s.charAt(5));
		
	}
	public static void main(String[] args) {
		String_Functions sf = new String_Functions();
		sf.stringFunctions();
	}
}
