package basicConcept;

public class FinallyConcept {

	public static void test1() {
		try {
			System.out.println("inside the test1() method");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Inside catch block");

			// final block will be executed always either exception occurred or
			// not
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void test2() {
		try {
			System.out.println("inside test2()-- test2()");
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int x = i / 0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("devide by zero error");
		} finally {
			System.out.println("execute this code even after any exception");
		}
		// } catch (ArithmeticException e) {
		// System.out.println("inside catch block");
		// System.out.println("Divide by zero error");
		// }
		// finally {
		// System.out.println("execute this code even after any exception");
		// }
	}

	public static void main(String[] args) {
		// test1();
		// test2();
		division();
	}

}
