package abstarctionAndAbstractConcept;

public abstract class Shape {
	int color;

	Shape() {
		System.out.println("shape class constructor");
	}

	abstract void drawing();

	public void fill() {
		System.out.println("shape---fill");

	}

	// can not create object of an abstract class or an instance of an abstract
	// class,
	// we can have reference of abstract class

	// we can achieve abstraction 0-100%--it depends on how many methods are
	// abstract and how many methods are concrete

	// an abstract class can contain constructors in Java.
	// And a constructor of abstract class is called when an instance of a
	// inherited class is created.

	// we can have an abstract class without any abstract method.
	// This allows us to create classes that cannot be instantiated, but can
	// only be inherited.

	// abstract class can have without abstract method-it will be 0 %
	// abstraction
	// abstract method can have final method which can not be overridden--can
	// not be override
	// In abstract class we can achieve 100% abstraction by making all method
	// abstract
	// Partial abstraction means--some method concrete come method abstract
	// Abstraction is the process of hiding the implementation details

	// Is it possible to create abstract and final class in Java?-No-abstract
	// class cannot be final in Java,
	// using both abstract and final modifier

	// Is it possible to have an abstract method in a final class?-No

	// Is it possible to inherit from multiple abstract classes in
	// Java?-no-because we can not
	// create object of abstract class
}
