package methodOverridingConcept;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Car--start");
	}

	public void stop() {
		System.out.println("Car--stop");
	}

	public void refuel() {
		System.out.println("car--refuel");
	}

	// 1.Overriding and Access-Modifiers :
	private void m1() {
		System.out.println("from parent m1()");
	}

	protected void m2() {
		System.out.println("from parent m2()");
	}

	// final method can not be override
	final void show() {
		System.out.println("parent--shwo()-final method can not be override");
	}
	// Static methods can not be overridden

	static void m3() {
		System.out.println("parent static m3()");
	}

	public void m4() {
		System.out.println("parent non-static m4()");
	}

}

// Rules for method overriding:
// 1.Overriding and Access-Modifiers : The access modifier for an overriding
// method can allow more, but not less,
// access than the overridden method. For example, a protected instance method
// in the super-class can be made public,
// but not private, in the subclass. Doing so, will generate compile-time error.

// 2.Final methods can not be overridden : If we don’t want a method to be
// overridden, we declare it as final.

// 3.Static methods can not be overridden(Method Overriding vs Method Hiding) :
// When you defines a static
// method with same signature as a static method in base class, it is known as
// method hiding.

// 4. Private methods can not be overridden :Private methods cannot be
// overridden as they are bonded during compile time.

// 6.Invoking overridden method from sub-class : We can call parent class method
// in overriding method using super keyword.

// 7.Overriding and constructor : We can not override constructor as parent and
// child class can never have constructor with same name(Constructor name must
// always be same as Class name).
// 8.Overriding and Exception-Handling :

// Rule#1 : If the super-class overridden method does not throws an exception,
// subclass overriding method can only throws the unchecked exception, throwing
// checked exception will lead to compile-time error.

// Rule#2 : If the super-class overridden method does throws an exception,
// subclass overriding method can only throw same, subclass exception. Throwing
// parent exception in Exception hierarchy will lead to compile time error.Also
// there is no issue if subclass overridden method is not throwing any
// exception.