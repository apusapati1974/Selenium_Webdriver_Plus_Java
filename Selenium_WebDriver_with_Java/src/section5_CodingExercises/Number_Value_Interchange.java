package section5_CodingExercises;

public class Number_Value_Interchange {
	
	public void thridVariable(int a,int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	
	public void withoutThirdVariable(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	
	public static void main(String[] args) {
		Number_Value_Interchange nvi = new Number_Value_Interchange();
		nvi.thridVariable(10, 20);
		nvi.withoutThirdVariable(100, 200);
	}
}
