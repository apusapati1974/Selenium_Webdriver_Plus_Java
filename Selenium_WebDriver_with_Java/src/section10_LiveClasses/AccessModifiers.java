package section10_LiveClasses;

public class AccessModifiers {
	
	public void defaultmethod() {
		System.out.println("This is Public Access Modifier");
	}
	
	private void method1() {
		System.out.println("This is Private Access Modifier");
	}
	
	void method2() {
		System.out.println("This is Default / Package Access Modifier");
	}
	
	protected void method3() {
		System.out.println("This is Protected Access Modifier");
	}
}
