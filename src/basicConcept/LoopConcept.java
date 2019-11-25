package basicConcept;

public class LoopConcept {

	public static void main(String[] args) {
		// Worst case to print a number
		// System.out.println(1);
		// System.out.println(2);
		// System.out.println(3);
		// System.out.println(5);

		// 1. while loop:It will generate infinite loop if you don't give
		// incremental/decremental part.
		int i = 1;// initialization
		while (i <= 10) {// condition
			System.out.println(i);
			i = i + 1;// Incremental/decremental
		}
		System.out.println("******");
		// 2. for loop:
		// j++=j+1
		// print 1 to 10
		for (int j = 1; j <= 10; j++) {// initialization, conditional,
										// incremental
			System.out.println(j);
		}

		System.out.println("******");
		// print 10 to 1
		for (int k = 10; k >= -10; k--) {// initialization, conditional,
			// decremental
			System.out.println(k);
		}

	}

}
