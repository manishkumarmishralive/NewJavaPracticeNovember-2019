package inheritance;

public class TestCar1 {

	public static void main(String[] args) {
		// static polymorphism--compile time polymorphism--polymorphism mean
		// one to many --method overriding and method overloading
		BMW b = new BMW();

		System.out.println("Reference of child type:" + b.value);
		b.start();
		b.autoParking();
		b.engine();// if car extends vehicle and BMW extends car then BMW can
		// call Vehicle or grand parent method or both
		b.fillFuel();
		b.theftSafety();

		System.out.println("*******");
		// Note that doing "Car car = new BMW()"
		// would produce same result
		Car car = b;// The reference variable of the Parent class is capable to
					// hold its object reference
		// as well as its child object reference.
		// car holding obj will access the value
		// variable of Car class
		System.out.println("Reference of parent type:" + car.value);
		Car c = new Car();
		c.engine();
		c.fillFuel();
		c.start();
		c.stop();

		System.out.println("***");

		// Top Casting
		Car c1 = new BMW();// child class object can be referred by parent class
							// reference variable---this is known as
		// Dynamic polymorphism-run time polymorphism
		// only common method and parent class method can be called by dynamic
		// polymorphism.
		// Parent class reference variable can not access child class property.
		c1.engine();
		c1.fillFuel();
		c1.start();
		c1.stop();

		// Down casting is not allowed:-at run time it will give
		// ClasscastException
		// BMW b1 = (BMW) new Car();
		// b1.autoParking();
		// b1.engine();
		// b1.fillFuel();
		// b1.start();
		// b1.stop();

	}

}
