package section11_LiveClasses;

public abstract class Abstraction_A {
	/*
	 * Requirements for Abstract & Concreate Methods and classes
	 *  3 Methods
	 *  Sum, 2 Integer Arguments
	 *  Sub, 2 Integer Arguments
	 *  Mul, 2 Integer Arguments
	 */
	public void sum(int a,int b) {
		System.out.println(a+b);
	}

	// This are Abstract Methods
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
}
