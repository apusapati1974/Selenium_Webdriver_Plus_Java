package section6_CodingExercises;

public class Check_String_Palindrome {
	
	public void Palindrome(String inputString) {
		String outputString = "";
		for(int i=inputString.length()-1;i>=0;i--) {
			outputString = outputString+inputString.charAt(i);
		}
		
		if(inputString.equalsIgnoreCase(outputString)) {
			System.out.println("Input & Output string are same - Its's a Palindrome"+inputString);
		}
		else {
			System.out.println("Input & Output string are not same - Its's not a Palindrome"+inputString);
		}
	}
	public static void main(String[] args) {
		Check_String_Palindrome csp = new Check_String_Palindrome();
		csp.Palindrome("madam");
	}
}
