package staticAndNonStaticConcept;

public class SatacAndNonStatic {

	// Global vars: the scope of global vars will be available across all the
	// functions with some conditions.
	// non static vars will be called by using class object
	// static vars will be called by either directly or by using class name
	String name = "Tom";// non-static global vars
	static int age = 24;// static global vars

	public static void main(String[] args) {
		// how to call static methods
		// 1. Direct calling
		sum();

		// 2. calling by class name
		SatacAndNonStatic.sum();

		// how to call static vars
		// 1. Direct calling
		System.out.println(age);

		// 2. calling by class name
		System.out.println(SatacAndNonStatic.age);

		// How to call non static methods and vars
		// 1. By creating object of the class
		System.out.println("Non-static methods and vars call");

		SatacAndNonStatic obj = new SatacAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);

		// Can i access static methods by using object reference?- yes
		obj.sum();// warning will be given should be call in static way. This is
					// not a good practice.

	}

	public void sendMail() {// non static method
		System.out.println("Send mail method");
	}

	public static void sum() {// static method
		System.out.println("sum method");
	}
}

// static is a non-access modifier in Java which is applicable for the
// following:
// blocks
// variables
// methods
// nested classes

// When a member(class vars and method) is declared static, it can be accessed
// before any objects of
// its class are created, and without reference to any object.

// Any static member can be accessed before any objects of its class are
// created, and without
// reference to any object.Methods declared as static have several restrictions:

// They can only directly call other static methods.
// They can only directly access static data.
// They cannot refer to this or super in any way.

// When to use static variables and methods?
// Use the static variable for the property that is common to all objects.