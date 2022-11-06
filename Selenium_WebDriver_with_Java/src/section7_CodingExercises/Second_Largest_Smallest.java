package section7_CodingExercises;

public class Second_Largest_Smallest {
	
	public void secondLargestSmallestValue() {
		
		int []arr = {10,20,30,40,50,60};
		int z = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					z = arr[j];
					arr[j] = arr[i];
					arr[i] = z;
				}
			}
		}
		
		System.out.println("The second largest value in array is "+arr[arr.length-2]);
		System.out.println("The second smallest valie is "+arr[1]);
	}
	public static void main(String[] args) {
		Second_Largest_Smallest obj = new Second_Largest_Smallest();
		obj.secondLargestSmallestValue();
	}
}
