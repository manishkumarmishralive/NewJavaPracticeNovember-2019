package oopConceptPart2;

public class FunctionsInJava {
	// main method --starting point of execution. once we run the program JVM
	// will search first main method to
	// start the execution.
	public static void main(String[] args) {
		// to call the method we need one entity--which is called object-object
		// will be created using class
		FunctionsInJava obj = new FunctionsInJava();// obj is not object--it is
													// obj reference name
		// one obj will be created, obj is the reference variable referring to
		// this object-new FunctionsInJavanew();
		// after creating the object, the copy of all non static methods will be
		// given to this object

		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		System.out.println(obj.qa());
		System.out.println(obj.division(10, 2));
		// main method is void --because never return a value.
	}

	// non-static method
	// functions and method both are same in java

	// The return type : The data type of the value returned by the method or
	// void if does not return a value.
	// void--does not return any value
	// return type --void
	public void test() {// no input, no output
		System.out.println("test method");
	}

	// return type--int
	public int pqr() {// no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String qa() {// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}

	// public-access modifier- it can be any below-
	// public-accessible in all class in your application.
	// protected-accessible within the class in which it is defined and in its
	// subclass(es)
	// private-accessible only within the class in which it is defined.
	// default(declared/defined without using any modifier) : accessible within
	// same class and package
	// within which its class is defined.

	// return type-int

	// division-method name. It can be anything like player, show, display, run,
	// move, addition, subtraction.

	// x & y--input parameters/arguments/parameter list

	// {int div = x / y; return div;}-method body

	public int division(int x, int y) {// some input, some output
		System.out.println("division method");
		int div = x / y;
		return div;
	}
}
