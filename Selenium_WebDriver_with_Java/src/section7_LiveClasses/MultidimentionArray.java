package section7_LiveClasses;

public class MultidimentionArray {
	public static void main(String[] args) {
		int [][]arr = {
				{11,22,33,44},
				{22,44,66,99}
		 };
		
		// Length of the Array 
		System.out.println("The Length of the array is "+arr.length);
		// Fetch the row by using index value
		System.out.println("The value from Third index is "+arr[0][3]);
		// using loop
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
