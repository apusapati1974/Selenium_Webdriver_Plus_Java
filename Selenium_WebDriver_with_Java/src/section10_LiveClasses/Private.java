package section10_LiveClasses;

public class Private {
	
	private void method1() {
		System.out.println("----------This is Private Access Modifier----------");
		System.out.println("This is Method_1");
	}
	public void method2() {
		this.method1();
	}
}
