package basicConcept;

public class FinalConcept {

	// to make value variable constant--we use final keyword with variable

	public static void main(String[] args) {
		// int i = 10;
		// i = 20;
		// i = 30;
		// System.out.println(i);

		final int j = 20;// once we use final it make constant.we can not
							// re-assign the value of variable.
		// j=30;//here we can not re-assign the value of j bc j is final.
		System.out.println(j);

	}

}
// Initializing a final variable :
// 1.You can initialize a final variable when it is declared.This approach is
// the most common. A final variable is called blank final variable,if it is not
// initialized while declaration.

// 2.A blank final variable can be initialized inside instance-initializer block
// or inside constructor. If you have more than one constructor in your class
// then it must be initialized in all of them, otherwise compile time error will
// be thrown.

// 3.A blank final static variable can be initialized inside static block.

// When a final variable is created inside a method/constructor/block, it is
// called local final variable,
// and it must initialize once where it is created.