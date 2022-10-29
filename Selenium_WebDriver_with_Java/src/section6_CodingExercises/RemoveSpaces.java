package section6_CodingExercises;

public class RemoveSpaces {
	public void removeSpacesInString(String inputString) {
		System.out.println("Initial String ---> "+inputString);
		System.out.println("String after removing spaces ---> "+inputString.replace(" ", ""));
		System.out.println("Number of spaces in a string ---> "+(inputString.length() - inputString.replace(" ", "").length()));
	}
	public static void main(String[] args) {
		RemoveSpaces obj  = new RemoveSpaces();
		obj.removeSpacesInString("This is selenium automation course");
	}
}
