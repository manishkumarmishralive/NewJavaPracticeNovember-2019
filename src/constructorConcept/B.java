package constructorConcept;

public class B extends A {
	// default cons
	public B() {
		// super key word is called parent class constructor
		// It should be the 1st statement in any constructor
		super();
	}

	// 1 Parameter cons
	public B(int i) {
		super(10);
	}

	// 2 Parameters cons
	public B(int i, int j) {

		super(10, 20);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(10);
		B b2 = new B(10, 20);

	}

}
