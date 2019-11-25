package constructorConcept;

public class A {

	public A() {

		System.out.println("Parent class constructor");
	}

	public A(int i) {
		System.out.println("single paremeter cons value i:" + i);
	}

	public A(int i, int j) {
		System.out.println("Parent class constructor with value of i and j:\n" + i + "\n" + j);
	}

}
