package inheritance;

public class Test3 {

	public static void main(String[] args) {
		// case-1
		Child c = new Child();// Making Child method private. It will give
								// compile time error
		c.foo();// here child class foo() will be called.

		// case-2
		// Base2 b = new Base2();// Making Base2 method private. It will give
		// compile time error
		// b.foo();// here Base2 class foo() will be called.

		// Base2 b1 = new Child();//Making Base2 method private. It will give
		// compile time error
		// b1.foo();// child class foo() called. Base Class foo() will be
		// override

	}

}
