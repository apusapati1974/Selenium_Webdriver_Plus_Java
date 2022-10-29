package section6_CodingExercises;

public class Compare_Last_Few_Characters {
	
	public void compareLast10Characters(String data1,String data2) {
		String s1 = data1.substring(data1.length()-10, data1.length());
		String s2 = data2.substring(data2.length()-10, data2.length());
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Last 10 Characters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else {
			System.out.println("Last 10 Characters are not same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}
	
	public void compareLastNCharacters(String data1,String data2,int number) {
		//fetch Last 10 characters in one string
		String s1 = data1.substring(data1.length()-number, data1.length());
		String s2 = data2.substring(data2.length()-number, data2.length());
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Last "+number+"Character are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else {
			System.out.println("Last "+number+" Characters are not same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}
	public static void main(String[] args) {
		Compare_Last_Few_Characters obj = new Compare_Last_Few_Characters();
		obj.compareLast10Characters("TestingHello", "WorldTesting");
		obj.compareLastNCharacters("TestingHello", "WorldTesting", 8);
	}
}
