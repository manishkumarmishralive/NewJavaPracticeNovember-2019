package basicConcept;

public class ArrayConcept {

	public static void main(String[] args) {
		// int i=20;//duplicate variable is not allowed
		// i=10;//here i latest value is 10

		// 1. int array
		// lowest bound/index=0
		// upper bound/index=n-1(n is size of array)

		int a[] = new int[4];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a[0]);
		System.out.println(a[3]);
		// System.out.println(a[4]);// it will give
		// ArrayIndexOutOfBoundsException
		// due to size. size does not exist
		// one dimensional array

		// advantage:
		// type safe
		// if you want to store similar data type then go to static array

		// dis-advantage of static array:
		// size is fixed-static array--to overcome this problem--we use
		// collections--ArrayList, HashTable--use dynamic array
		// store similar data type: if you declare int then it will take only
		// int--to overcome this problems--use obj array

		System.out.println(a.length);
		// print all values of array: use for loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("**Double array****");
		// 2.double array:
		double d[] = new double[4];
		d[0] = 23.33;
		d[1] = 33.33;
		d[2] = 12.33;
		d[3] = 12.90;
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("***Char array***");
		// 3.char array
		char c[] = new char[3];

		c[0] = 'A';
		c[1] = 'D';
		c[2] = 'e';
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println("***Boolean array****");
		// 4. boolean array:
		boolean b[] = new boolean[2];

		b[0] = true;
		b[1] = false;
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}
		System.out.println("***String array****");
		// 5. String array:

		String s[] = new String[4];

		s[0] = "Maneesh";
		s[1] = "Pankaj";
		s[2] = "Raju";
		s[3] = "Mahendra";
		System.out.println(s.length);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);

		}
		System.out.println("****obejct array*****");
		// object array:(Object is class)-- is used to store different data
		// types values

		Object ob[] = new Object[6];
		ob[0] = "Maneesh";
		ob[1] = 123;
		ob[2] = 'A';
		ob[3] = true;
		ob[4] = 12.34;
		ob[5] = 12 / 12 / 12;

		System.out.println(ob.length);

		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);

		}
	}

}
