package abstarctionAndAbstractConcept;

public class Test extends Shape {

	Test() {
		System.out.println("Test class constructor");
	}

	public static void main(String[] args) {
		Test t = new Test();

		t.drawing();

		Shape s = new Test();
		s.drawing();

	}

	@Override
	void drawing() {
		System.out.println("Shape--drawing");
	}

}
