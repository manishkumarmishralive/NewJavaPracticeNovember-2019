package basicConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);// string concatenation concept

		// data conversion:String to int
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// Integer, double, Character, Boolean: all have data conversion
		String s1 = "12.33";
		double d = Double.parseDouble(s1);
		System.out.println(d + 10);

		// String to Boolean:

		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to String conversion:
		int j = 120;
		System.out.println(j + 20);
		String s2 = String.valueOf(j);
		System.out.println(s2 + 20);

		String s3 = "100A";
		Integer.parseInt(s3);// NumberFormatException--for input String="100A".
								// It's not a pure numeric.

	}

	// A Wrapper class is a class whose object wraps or contains a primitive
	// data types. When we create an
	// object to a wrapper class, it contains a field and in this field, we can
	// store a primitive data types.

	// Need of Wrapper Classes
	// They convert primitive data types into objects. Objects are needed if we
	// wish to modify the arguments passed into
	// a method (because primitive types are passed by value).
	// The classes in java.util package handles only objects and hence wrapper
	// classes help in this case also.
	// Data structures in the Collection framework, such as ArrayList and
	// Vector, store only objects (reference types)
	// and not primitive types.

}
