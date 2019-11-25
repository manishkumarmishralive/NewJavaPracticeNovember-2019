package constructorConcept;

public class Test {
	// Assigning values to static final variables in Java:

	// non-static final variables can be assigned either in constructor or with
	// declaration
	// but static final variable can not be assigned value in constructor. They
	// must be assigned value with declaration or
	// in static block.

	// non-static final variable
	// final int k;
	//
	// Test() {
	// k = 10;
	// }

	// static final variable
	static final int i;
	static {
		i = 10;
	}

	public static void main(String[] args) {
		System.out.println(i);
	}

}
