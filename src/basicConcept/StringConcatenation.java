package basicConcept;

public class StringConcatenation {

	public static void main(String[] args) {
		// +: concatenation operator
		// println: is used to print on the console with new line
		// print: is used to print on the console

		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";

		System.out.println(a + b);

		System.out.println(x + y);
		System.out.println(a + x);// 100Hello
		System.out.println(x + a);// hello100
		System.out.println(a + b + x + y);// 300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));// HelloWorld300
		System.out.println(a + b + x + y + a + x + b + y);// 300HelloWorld100Hello200World
		System.out.println(a + b + x + y + a + b);// 300HelloWorld100200
		System.out.println("The value of a is:" + a);
		System.out.println("The value of b is:" + b);
		// it will be same for float and double

	}

}
