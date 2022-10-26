package section5_LiveClasses;

public class whileloop {
	public void naturalNumbers() {
		int i = 1;
		while(i<=10) {
			i++;
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) {
		whileloop wl = new whileloop();
		wl.naturalNumbers();
	}
}
