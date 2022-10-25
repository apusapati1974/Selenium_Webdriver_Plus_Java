package section4_CodingExercises;

// Problem Description - Check the Grade	

public class Code_5 {
	
	public void checkGrade(int maths,int physcis,int chemistry,int botony,int zoology) {
		
		int totalPercentage = ((maths+physcis+chemistry+botony+zoology)/5);
		
		if(totalPercentage >= 90 && totalPercentage <= 100) {
			System.out.println("Grade A");
		}
		else if(totalPercentage >= 80) {
			System.out.println("Grade B");
		}
		else if(totalPercentage >= 70) {
			System.out.println("Grade C");
		}
		else if(totalPercentage >= 50) {
			System.out.println("Grade D");
		}
		else if(totalPercentage >= 40) {
			System.out.println("Grade E");
		}
		else if(totalPercentage >= 0) {
			System.out.println("Grade F");
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
	public static void main(String[] args) {
		Code_5 c = new Code_5();
		c.checkGrade(10, 20, 30, 40, 50);
		c.checkGrade(100, 90, 89, 75, 69);
	}
}
