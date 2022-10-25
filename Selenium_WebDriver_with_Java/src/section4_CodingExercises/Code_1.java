package section4_CodingExercises;
/*
 * Problem Description - 
 *    Largest among Three Numbers
 *    Smallest among Three Numbers
 */
public class Code_1 {
	
	    // Largest of Three Numbers
	
		public void largest(int a,int b,int c) {
			if(a>=b && a>=c) {
				System.out.println("A is the Largest Number..."+a);
			}
			else if(b>=a && b>=c) {
				System.out.println("B is the Largest Number..."+b);
			}
			else if(c>=a && c>=b) {
				System.out.println("C is the Largest Number..."+c);
			}		
		}
		
		//Smallest of Three Numbers
		
		public void smallest(int a,int b,int c) {
			if(a<=b && a<=c) {
				System.out.println("A is the Smallest Number..."+a);
			}
			else if(b<=a && b<=c) {
				System.out.println("B is the Smallest Number..."+b);
			}
			else if(c<=a && c<=b) {
				System.out.println("C is the Smallest Number..."+c);
			}
		}
		
		public static void main(String[] args) {
			Code_1 c = new Code_1();
			c.largest(10, 20, 30);
			c.largest(1, 5, 1);
			c.smallest(1, 2, 3);
		}

}
