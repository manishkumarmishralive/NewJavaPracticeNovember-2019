package oopConceptPart2;

public class LocalVsGlobalVariable {

	// Global vars--class variables or instance variable
	// Global vars can not be called directly. It will be called by object
	// the scope of name and age are global. we can access anywhere
	String name = "Tom";
	int age = 24;
	// copy of all non-static variables and non-static method given to the obj
	// and after we want to access
	// non-static variable and method we can access by obj.

	public static void main(String[] args) {
		int i = 10;// Local variable for main method
		// scope of this i is only inside only main method. we can not access
		// outside the main method.
		System.out.println(i);

		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public void sum() {
		int i = 20;// Local variable for sum method
		int j = 30;
		// Scope of i and j are inside the sum method. we can not access outside
		// the sum method/

	}

}
