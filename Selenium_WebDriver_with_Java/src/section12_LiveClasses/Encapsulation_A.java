package section12_LiveClasses;

public class Encapsulation_A {
	
	private int id;  //which cannot access outside the class directly.
	private String name;
	
	// Creating Setter Method
	public void setId(int id) {
		/* Get the num as input and assign the value of this input num to the id.
		 * Setter method is used to set the value of private variable.
		 * When ever user call the method(int id) and provide the value as id & this id will 
		 * transfer to the global variable.
		 */
		
		/*
		 * This Keyword - because we have global & Local variable with same name.
		 *  this keyword will define this is global variable
		 */
		this.id = id;
	}
	
	// Creating Getter Method - used to fectch the value of Int id variable.
	public int getId() {
		return id;
	}
	
}
