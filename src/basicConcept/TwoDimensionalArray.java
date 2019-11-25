package basicConcept;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String a[][] = new String[3][5];
		System.out.println(a.length);// total no of rows=3
		System.out.println(a[0].length);// total no of columns=5

		a[0][0] = "A";
		a[0][1] = "B";
		a[0][2] = "C";
		a[0][3] = "D";
		a[0][4] = "E";

		a[1][0] = "A1";
		a[1][1] = "B1";
		a[1][2] = "C1";
		a[1][3] = "D1";
		a[1][4] = "E1";

		a[2][0] = "A2";
		a[2][1] = "B2";
		a[2][2] = "C2";
		a[2][3] = "D2";
		a[2][4] = "E2";

		System.out.println(a[0][0]);
		System.out.println(a[1][4]);

		// print all the values of 2D array: use for loop
		// row=0, col=0-4
		// row=1, col=0-4
		// row=2, col=0-4

		System.out.println("***all values of 2d array****");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.println(a[row][col]);
			}
		}
	}

}
