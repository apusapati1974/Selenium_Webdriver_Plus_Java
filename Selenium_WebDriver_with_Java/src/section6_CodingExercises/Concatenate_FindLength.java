package section6_CodingExercises;

public class Concatenate_FindLength {
	
	public void concatLength(String s1,String s2) {
		String concatString = s1+s2;
		System.out.println("The Concatenated String "+concatString+" \n Find Length of Concatenated String is "+concatString.length());
	}
	public static void main(String[] args) {
		Concatenate_FindLength obj = new Concatenate_FindLength();
		obj.concatLength("Selenium", "Automation");
	}
}
