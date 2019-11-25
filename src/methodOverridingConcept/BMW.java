package methodOverridingConcept;

public class BMW extends Car {// HAS-A relationship

	// when same method present in parent class as well as in child class with
	// same name and same number
	// of arguments/input parameters, is called method overriding.

	public void start() {// overridden method:// This method overrides show() of
							// Parent
		super.start();// We can call parent class method in overriding method
						// using super keyword.
		System.out.println("BMW--start");
	}

	public void musicSystem() {
		System.out.println("BMW--musicSyatem");
	}

	public void theftSafety() {
		System.out.println("BMW--theftsafety");
	}

	private void m1() {
		System.out.println("from child m1()");
	}

	public void m2() {
		System.out.println("from child m2()");
	}

	// it will compile time error. Final method can not be override.
	// public void show(){
	// System.out.println();
	// }

	static void m3() {
		System.out.println("child static m3()");
	}

	public void m4() {
		System.out.println("child non-static m4()");
	}

}
