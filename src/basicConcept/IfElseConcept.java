package basicConcept;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;

		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		// Comparison operator:
		// < >, <=, >=, ==, !=
		int c = 40;
		int d = 50;

		if (c == d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c & d are not equal");
		}
		// write a logic to find out the highest number
		int a1 = 400;
		int b1 = 5000;
		int c1 = 300;
		// nested if else
		if (a1 > b1 & a1 > c1) {// false & false=false//true & true=true//false
								// & false=false
			System.out.println("a1 is greatest.");

		} else if (b1 > c1) {
			System.out.println("b1 is greatest.");

		} else {
			System.out.println("c1 is greatest.");
		}

	}

}
