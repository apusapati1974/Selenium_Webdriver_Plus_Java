package section5_CodingExercises;

public class Check_Prime_Number {
	public void primeNumber(int a) {
		boolean value = false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				value = true;
				break;
			}
		}
		
		if(value == false) {
			System.out.println();
			System.out.println("Its a prime number - "+a);
		}
	}
	public static void main(String[] args) {
		Check_Prime_Number cpn = new Check_Prime_Number();
		cpn.primeNumber(25);
	}
}
