package section7_CodingExercises;

public class SearchValueAndOccurences {
	
	public void searchOccurance(int valueToSearch) {
		// Find the value in array and it's Occurance
		int []arr = {33,65,2,456,67,54,33,42,33,33};
		int count = 0;
		
		//Run a loop for each item in array to verify the value exist in array.
		// If value exist then increase the count.
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == valueToSearch) {
				count = count+1;
			}
		}
		
		if(count > 0) {
			System.out.println("Value found in array successfully");
			System.out.println("Value find---"+count+"---Times");
		}
		else {
			System.out.println("Value not found in array");
		}
	}
	public static void main(String[] args) {
		System.out.println("**************************************");
		SearchValueAndOccurences obj = new SearchValueAndOccurences();
		obj.searchOccurance(33);
	}
	
}
