package constructorConcept;

public class ChildClass extends SuperKeywordConcept {

	int max = 70;

	ChildClass() {
		super(10, 20);// this super() is used to call parent class constructor.
		System.out.println("child class constructor");
	}

	public void display() {
		//// will invoke or call current class start() method
		start();

		// will invoke parent class start() method
		super.start();

		System.out.println("Max value is:" + super.max);// here super is used to
														// print max value of
														// base class
	}

	public void start() {
		System.out.println("child class--start");
	}

}
// Other Important points:

// Call to super() must be first statement.
// If a constructor does not explicitly invoke a superclass constructor, the
// Java compiler automatically
// inserts a call to the no-argument constructor of the superclass. If the
// superclass does not have
// a no-argument constructor, you will get a compile-time error. Object does
// have such a constructor, so if Object is the only superclass, there is no
// problem.
// If a subclass constructor invokes a constructor of its superclass, either
// explicitly or implicitly, you might think that a whole chain of constructors
// called, all the way back to the constructor of Object. This, in fact, is the
// case. It is called constructor chaining..