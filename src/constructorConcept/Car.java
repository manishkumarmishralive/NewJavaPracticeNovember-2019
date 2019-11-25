package constructorConcept;

public class Car {
	// class vars
	String name;
	int price;
	String engine;

	// Rules of constructor chaining :

	// The this() expression should always be the first line of the constructor.
	// There should be at-least be one constructor without the this() keyword.
	// Constructor chaining can be achieved in any order.

	// Default const1
	public Car() {
		System.out.println("default cons");
	}

	// Parameter cons 2
	public Car(String name) {
		this();
		System.out.println("single parameter cons");
		System.out.println(name);
	}

	// Parameter cons3
	public Car(String name, int price) {
		this("Maneesh");
		System.out.println("double paramter constructor");
		System.out.println(name + "\n" + 10);
	}

	// parameter cons 4
	public Car(String name, int price, String engine) {
		this.name = name;// local variables:here we are initializing class
							// variable with local variable
		this.price = price;
		this.engine = engine;
		System.out.println();
	}

	public static void main(String[] args) {
		Car obj = new Car("BMW", 80, "Automatic");
		System.out.println(obj.name + " " + obj.price + " " + obj.engine);
		Car obj1 = new Car("Honda", 10, "Manual");
		System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);
		Car obj2 = new Car("Audi", 30, "Automatic");
		System.out.println(obj2.name + " " + obj2.price + " " + obj2.engine);
		Car obj3 = new Car("Merc", 40, "Automatic");
		System.out.println(obj3.name + " " + obj3.price + " " + obj3.engine);

		// Car obj4 = new Car();
		Car obj5 = new Car("I-10", 8);

	}

}
