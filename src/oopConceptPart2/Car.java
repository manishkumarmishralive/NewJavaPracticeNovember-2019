package oopConceptPart2;

public class Car {

	// class variable or instance variable or global variable or data member
	int mod;
	int wheel;

	public static void main(String[] args) {

		// a--object reference variable who is referring object--new Car()--This
		// is object of Car class
		// new keyword is used to create the object
		// a, b, c --is object reference variable not the object
		// new Car();--this is object of car class
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2014;
		b.wheel = 4;

		c.mod = 2018;
		c.wheel = 4;

		System.out.println("Before assigning the the references:");
		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("After shifting the references:");

		a = b;
		b = c;
		c = a;

		a.mod = 10;
		System.out.println(a.mod);// 10
		c.mod = 20;
		System.out.println(a.mod);// 20
		System.out.println(c.mod);// 20
		a.mod = 21;
		System.out.println(c.mod);// 21
		System.out.println(c.mod);// 21

		b.mod = 23;
		System.out.println(b.mod);// 23
	}

}
