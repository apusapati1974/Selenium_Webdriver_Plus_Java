package section7_CodingExercises;

public class Find_Largest_Smallest_Value {
	
	public void findLargestSmallest() {
		//First Sort the array in ascending order and fetch last value
		int []arr = {10,20,30,40,50,60};
		int x=0;
		
		// Array in Ascending Order
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					x = arr[j];
					arr[j] = arr[i];
					arr[i] = x;
				}
			}
		}
		
		// Now fetch last value form the Array
		System.out.println("Largest Value in Array is "+arr[arr.length-1]);
		// fetch the value of array that should be smallest
		System.out.println("Smallest Value in Array is "+arr[0]);
	}
	public static void main(String[] args) {
		Find_Largest_Smallest_Value obj = new Find_Largest_Smallest_Value();
		obj.findLargestSmallest();
	}
}
