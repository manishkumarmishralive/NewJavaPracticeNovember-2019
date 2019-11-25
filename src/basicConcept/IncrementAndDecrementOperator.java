package basicConcept;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// ++
		// --
		System.out.println("**Post increment***");
		int i = 1;// 2
		int j = i++;// post increment j=1 1st assign the value and then increase
					// by 1
		System.out.println(i);
		System.out.println(j);

		System.out.println("***Pre-increment***");
		int a = 1; // 2
		int b = ++a;// pre increment//2
		System.out.println(a);
		System.out.println(b);

		System.out.println("***Post-decrement****");

		int m = 1;// 0
		int n = m--;// 1 //post decrement
		System.out.println(m);
		System.out.println(n);

		System.out.println("***Pre-decrement****");

		int x = 1;// 0
		int y = --x;// 0 pre decrement
		System.out.println(x);
		System.out.println(y);

	}

}
