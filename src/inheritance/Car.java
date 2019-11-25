package inheritance;

public class Car extends Vehicle {

	// Inheritance and constructor in Java

	int value = 100;// Parent and Child classes having same data member in Java

	Car() {
		super.start();
		System.out.println("car class-constructor");
	}

	// Private method can not be override. it will give compile time error.
	// compiler tries to call base class function not derived class
	// An inner class can access private members of its outer class.
	// What if we extend an inner class and create fun() in the inner class?
	// private methods are bonded during compile time and it is the type of the
	// reference
	// variable – not the type of object that it refers to – that determines
	// what method to be called.

	// private void start() {
	public void start() {
		System.out.println("Car---start");
	}

	public void stop() {
		System.out.println("Car---Stop");
	}

	public void fillFuel() {
		System.out.println("Car---refuel");
	}
}

// final is a keyword in java used for restricting some functionalities.
// We can declare variables, methods and classes with final keyword.

// Using final with inheritance

// During inheritance, we must declare methods with final keyword for which we
// required to follow the same
// implementation throughout all the derived classes. Note that it is not
// necessary to declare final methods in
// the initial stage of inheritance(base class always). We can declare final
// method in any subclass for which
// we want that if any other class extends this subclass, then it must follow
// same implementation of the method
// as in the that subclass.

// When a class is declared as final then it cannot be subclassed i.e. no any
// other class can extend it.

// Note:
// Declaring a class as final implicitly declares all of its methods as final,
// too.
// It is illegal to declare a class as both abstract and final since an abstract
// class is incomplete by
// itself and relies upon its subclasses to provide complete implementations.

// When a method is declared as final then it cannot be overridden by
// subclasses.The Object
// class does this—a number of its methods are final.
