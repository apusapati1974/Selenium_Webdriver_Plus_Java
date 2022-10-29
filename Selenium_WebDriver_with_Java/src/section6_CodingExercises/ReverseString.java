package section6_CodingExercises;

public class ReverseString {

	// First Approch.
	public void reverseString1(String inputString) {
		for(int i = inputString.length()-1;i>=0;i--) {
			System.out.print(inputString.charAt(i));
		}
		System.out.println();
	}
	
	// Second Approch.
	public void reverseString2(String inputString) {
		String outputString = "";
		for(int i = inputString.length()-1;i>=0;i--) {
			outputString = outputString+inputString.charAt(i);
		}
		System.out.println(outputString);
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		System.out.println("------Reverse String Approch-1------");
		rs.reverseString1("Selenium");
		System.out.println("------Reverse String Approch-2------");
		rs.reverseString2("Automation");
	}
}
