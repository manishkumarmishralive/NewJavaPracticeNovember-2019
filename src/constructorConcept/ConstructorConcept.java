package constructorConcept;

public class ConstructorConcept {
	// class variable
	String name;
	int age;

	// constructor: to call the constructor of any class we have to create the
	// object of class.
	// after creating obj of class, constructor will be invoked automatically
	// Duplicate constructor not allowed
	// Once object is created, constructor automatically called.
	// caling will be depend on argument. if pass one argument it will call one
	// argument cons and so on....

	// Constructor Overloading:
	// we can overload constructors for creating objects in different ways.
	// Compiler differentiates constructors on the basis of numbers of
	// parameters, types of the parameters
	// and order of the parameters.
	public ConstructorConcept() {// 0 parameter
		System.out.println("default constructor");
	}

	public ConstructorConcept(int i) {// 1 parameter
		System.out.println("1 parameter constructor");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) {// 2 parameters
		System.out.println("2 parameters constructor");
		System.out.println("" + i + "\n" + j);
	}

	public ConstructorConcept(String name, int age) {
		this.name = name; // this.name=name is local var
		this.age = age;// this.age=age is local var
	}

	// Main method
	public static void main(String[] args) {

		ConstructorConcept cons = new ConstructorConcept();
		ConstructorConcept cons1 = new ConstructorConcept(10);
		ConstructorConcept cons2 = new ConstructorConcept(10, 20);
		ConstructorConcept cons3 = new ConstructorConcept("name", 20);

	}

	// constructor just like a function. it contain collection of statements
	// like a method.
	// but does not return any return any value. we can never write return with
	// constructor.
	// constructor name should be same as class name.

	// How constructors are different from methods in Java?
	// Constructor(s) must have the same name as the class within which it
	// defined while
	// it is not necessary for the method in java.
	// Constructor(s) do not return any type while method(s) have the return
	// type or void if does not return any value.
	// Constructor is called only once at the time of Object creation while
	// method(s) can be called any numbers of time.

}
