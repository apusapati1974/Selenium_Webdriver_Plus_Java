package section4_CodingExercises;

// Problem Description - Triangle Type

public class Code_4 {
	
	public void traingle(int side1,int side2,int side3) {
		if(side1 == side2 && side1 == side3) {
			System.out.println("Equilateral Traingle...");
		}
		else if(side1 != side2 && side2 != side3 && side1 != side3) {
			System.out.println("Scalene Traingle...");
		}
		else if(
			   ((side1 == side2 && side1 != side3) || (side1 == side3 && side1 != side2))
			|| ((side1 == side2 && side2 != side3) || (side2 == side3 && side1 != side3))
			|| ((side1 == side3 && side2 != side3) || (side2 == side3 && side1 != side3))) {
			System.out.println("Isosceles Traingle...");
		}
				
	}
	public static void main(String[] args) {
		Code_4 c = new Code_4();
		c.traingle(10, 10, 30);
		c.traingle(10, 10, 10);
		c.traingle(10, 20, 30);
	}

}
