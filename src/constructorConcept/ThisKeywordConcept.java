package constructorConcept;

public class ThisKeywordConcept {

	int a;
	int b;

	ThisKeywordConcept() {
		// 2.Using this() to invoke current class constructor
		// this(10, 20);
		// System.out.println("Default const");

		a = 10;
		b = 20;
	}

	// ThisKeywordConcept(int a, int b) {
	// // 1. Using ‘this’ keyword to refer current class instance variables
	// this.a = a;
	// this.b = b;
	// System.out.println("Paramerized const");
	//
	// }

	// 3. Using ‘this’ keyword to return the current class instance
	// Method that returns current class instance
	ThisKeywordConcept get() {
		return this;

	}

	void display() {
		System.out.println(a + "\n" + b);
	}

	public static void main(String[] args) {
		ThisKeywordConcept obj = new ThisKeywordConcept();
		obj.get().display();
		obj.display();

	}

}
// 4. Using ‘this’ keyword as method parameter
// 5. Using ‘this’ keyword to invoke current class method
// 6. Using ‘this’ keyword as an argument in the constructor call