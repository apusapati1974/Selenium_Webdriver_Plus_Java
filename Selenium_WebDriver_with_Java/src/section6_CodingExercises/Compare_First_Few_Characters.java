package section6_CodingExercises;

public class Compare_First_Few_Characters {
	public void compareFirst10Characters(String data1,String data2) {
		// fetch first 10 characters of string
		String s1 = data1.substring(0, 10);
		String s2 = data2.substring(0, 10);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("First 10 Charaters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else {
			System.out.println("First 10 Characters are not same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}
	
	public void compareFirstNCharacters(String data1,String data2,int number) {
		String s1 = data1.substring(0, number);
		String s2 = data2.substring(0, number);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("First "+number+"Characters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else {
			System.out.println("First "+number+"Characters are not same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}
	public static void main(String[] args) {
		Compare_First_Few_Characters obj = new Compare_First_Few_Characters();
		obj.compareFirst10Characters("This is Testing World", "This is Testing World");
		obj.compareFirstNCharacters("This is Testing World", "This is Testing World", 8);
	}
}
