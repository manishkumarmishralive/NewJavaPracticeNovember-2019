package methodOverridingConcept;

public class TestCar {

	public static void main(String[] args) {
		// static polymorphism--compile time polymorphism
		// Polymorphism-one to many
		System.out.println("*************");
		BMW b = new BMW();
		b.start();// BMW--start called not Car Start called--override Car
					// start--method
					// overriding --method can be override
		// without declaring @override in Car class start method
		b.stop();
		b.musicSystem();
		b.refuel();
		b.theftSafety();
		b.engine();
		b.m2();// m2 from BMW class

		BMW.m3();// method hiding-Parent m3() will be hide of parent child both
					// are static
		b.m4();// override parent m4()

		System.out.println("********");

		Car c = new Car();
		c.refuel();
		c.start();
		c.stop();

		// A parent class can not access all the property of child class or any
		// property of child class.
		c.m2();
		Car.m3();// Parent m3()
		c.m4();// Parent m4()

		System.out.println("******");
		// Top casting
		Car c1 = new BMW();// Child class object can be referred by parent class
							// reference variable--is called
		// runtime polymorphism or dynamic polymorphism.
		c1.refuel();
		c1.start();// it will call BMW start method at run time not Car class
					// start.
		c1.stop();
		c1.m2();
		Car.m3();// Parent static m3 bc static method can not be override
		c1.m4();// child non-static m4(). override parent m4() bc it's non
				// static method

		// only common method and Car class method can be called by dynamic
		// polymorphism. It can not called BMW class own
		// method. can not called theftSafety method by dynamic polymorphism.

		// Down casting
		// BMW b1=new Car();//down casting is not allowed in java. At runtime it
		// will give ClassCastException.
		// BMW b2 = (BMW) new Car();// it will give ClassCastException

	}

}
