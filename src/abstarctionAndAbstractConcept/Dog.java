package abstarctionAndAbstractConcept;

public class Dog extends Animal {
	// can not override final method from animal
	// public void bark(){
	// System.out.println("Animal --final bark method");
	// }

	public void run() {
		System.out.println("Dog--run");
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.bark();
		d.eat();
		d.run();

		Animal a = new Dog();
		a.bark();
		a.eat();

	}

}
