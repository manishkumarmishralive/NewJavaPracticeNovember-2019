package abstarctionAndAbstractConcept;

//// An abstract class with a final method
public abstract class Animal {

	public void eat() {
		System.out.println("Animal--eat");
	}

	public final void bark() {
		System.out.println("Animal --final bark method can not be override");
	}
}
