package section7_CodingExercises;

public class Array_Sorting {

	public static void main(String[] args) {
		
		// Sort Array in Asscending / Descending order
		int []arr = {10,20,30,40,50,60};
		int x;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					x = arr[j];
					arr[j] = arr[i];
					arr[i] = x;
				}
			}
		}
		
		// Display the Array in Ascending Order
		System.out.println("-------Ascending Order-------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*****************************");
		
		// Display the Array in Descending Order
		System.out.println("-------Descending Order-------");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		System.out.println("*****************************");
	}

}
