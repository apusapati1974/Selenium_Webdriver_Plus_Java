package section6_CodingExercises;

public class WordCountString {
	public void wordCount(String inputString) {
		String []character =  inputString.split(" ");
		System.out.println("Number of words in given string are "+character.length);
	}
	public static void main(String[] args) {
		WordCountString obj = new WordCountString();
		obj.wordCount("This is Selenium Automation Course");
	}
}
