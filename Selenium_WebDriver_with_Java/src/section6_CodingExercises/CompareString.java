package section6_CodingExercises;

public class CompareString {
	public void compareStringSpaces(String s1,String s2) {
		if(s1.trim().equalsIgnoreCase(s2.trim())) {
			System.out.println("Strings are same");
		}
		else {
			System.out.println("Strings are not same");
		}
	}
	public static void main(String[] args) {
		
		CompareString obj = new CompareString();
		obj.compareStringSpaces("Anudeep ", " Anudeep");
	}
}
