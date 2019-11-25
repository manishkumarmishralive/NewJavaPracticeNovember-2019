package inheritance;

public class BMW extends Car {// Has-A relationship

	int value = 10;// Parent and Child classes having same data member in Java

	BMW() {
		System.out.println("BMW class--constructor");
	}

	// when same method present in parent class as well as child class with same
	// name and number of arguments,
	// is called method overriding.
	@Override
	public void start() {
		// public void start() {// Overridden method
		super.start();// Accessing Grandparent’s member in Java using super is
						// only possible
		// through parent class. we can not access directly grand parent member.
		// this super.super().start();
		// will give compile time error.

		// super.super().start(); // Try to access vehicle class start(). This
		// is not possible
		System.out.println("BMW--start");

	}

	public void autoParking() {
		System.out.println("BMW--autoParking() method");
	}

	public void theftSafety() {
		System.out.println("BMW--TheftSafety");
	}

}
