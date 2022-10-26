package section5_LiveClasses;

public class ForEachLoop {
	public void loop() {
		int []a = {1,2,3,4,5};
		for(int z : a) {
			System.out.println(z);
		}
	}
	public static void main(String[] args) {
		ForEachLoop fel = new ForEachLoop();
		fel.loop();
	}
}
