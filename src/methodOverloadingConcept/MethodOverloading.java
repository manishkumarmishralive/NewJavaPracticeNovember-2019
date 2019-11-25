package methodOverloadingConcept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(40, 50);
		obj.sum(70, 55);

	}

	// we can overload main method also.
	public static void main(int p) {

	}

	public static void main(int p, int q) {

	}
	// duplicate methods are not allowed in java. Either method should be
	// different by name or by number of input parameter or
	// type of input parameter or both. It does not depend on order of input
	// parameter.
	// this is called method overloading.
	// we can not write method inside the method.

	// Method overloading: when different method to have the same name, but
	// different signatures where signature can be differ by
	// number of input parameters or type/data type of input parameters, within
	// same
	// class, is called method
	// overloading.

	// Method overloading is example of compile time polymorphism. It is also
	// known as static polymorphism.

	public void sum() {// 0 input parameter
		System.out.println("SUM method--printing");
	}

	public void sum(int i) {// 1 input parameter
		System.out.println("sum method--print with one input parameter");
		System.out.println(i);
	}

	public void sum(int i, int j) {// 2 input parameters
		System.out.println("sum method--printing with two input parameter with same type int");
		System.out.println(i + "  " + j);
	}

	// Method overloading is possible by changing order of different data input
	// parameter like int, double.
	public void sum(int i, double j) {

		System.out.println("sum method--priting with two input parameters with different type int and double");

	}

	public void sum(double j, int i) {
		System.out.println(
				"sum method--printing by changing order with different data type input parameter int and double");
	}

	// We cannot overload by return type.
	/*
	 * public class Main { public int foo() { return 10; } // compiler error:
	 * foo() is already defined public char foo() { return 'a'; }
	 * 
	 * public static void main(String args[]) { } }
	 * 
	 * Overloading methods on return type are possible in cases where the data
	 * type of the function being called is explicitly specified. class A {
	 * public int foo(int a) { return 10; }
	 * 
	 * public char foo(int a, int b) { return 'a'; } }
	 * 
	 * public class Main {
	 * 
	 * public static void main(String args[]) { A a = new A();
	 * System.out.println(a.foo(1)); System.out.println(a.foo(1, 2)); } }
	 */

	// advantage:
	// We don’t have to create and remember different names for functions doing
	// the same thing.

	// Can we overload static methods?
	// The answer is ‘Yes’. We can have two ore more static methods with same
	// name,
	// but differences in input parameters.

	// Can we overload methods that differ only by static keyword?
	// We cannot overload two methods in Java if they differ only by static
	// keyword
	// (number of parameters and types of parameters is same).

}
