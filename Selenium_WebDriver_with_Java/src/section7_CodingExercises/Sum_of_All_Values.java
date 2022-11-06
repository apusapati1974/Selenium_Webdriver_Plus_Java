package section7_CodingExercises;

public class Sum_of_All_Values {
	public static void main(String[] args) {
		int []arr = {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println("The sum of All values are - "+sum);
	}
}
