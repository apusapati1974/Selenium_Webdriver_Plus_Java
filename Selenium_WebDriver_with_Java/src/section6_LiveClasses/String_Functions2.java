package section6_LiveClasses;

public class String_Functions2 {
	
	String s = "This is Selenium Automation Training";
	String s1 = "Course";
	public void stringHandling() {
		
		// Replace the String 
		System.out.println("The string is replaced with Selenium Automation to "+s.replace("Automation", "Course"));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Find the string without using loop
		int count = s.length() - s.replace("e", "").length();
		System.out.println("Count of string e is "+count);
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Concatenate the string
		System.out.println("The Concatenation of s & s1 are (Method-1)"+s+" "+s1);
		System.out.println("The Concatenation of s & s1 are (Method-2)"+s.concat(s1));
		System.out.println("The Concatenation of s & s1 are (Method-3)"+s.concat(" ").concat(s1));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Sub-string 
		System.out.println("The Substring from the index 2-9 is "+s.substring(2, 9)); // In String concept last index is ignored.
		System.out.println("The Substring from 9th index is "+s.substring(9));
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Check the string "ium" is present in s 
		if(s.contains("en")) {
			System.out.println("The String(en) is Found");
		}
		else {
			System.out.println("The String(en) is not Found");
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		
		// Split the String according to the space
		System.out.println("----Spliting of String------");
		String []arr = s.split(" ");
		for(String a : arr) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		String_Functions2 sf = new String_Functions2();
		sf.stringHandling();
	}
}
