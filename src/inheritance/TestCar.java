package inheritance;

public class TestCar {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1.engine();// Grand parent or Parent class can not access child class
					// object

		Car c1 = new Car();
		c1.engine();
		c1.fillFuel();
		c1.start();
		c1.stop();

		BMW b1 = new BMW();

		b1.autoParking();
		b1.engine();
		b1.fillFuel();
		b1.start();
		b1.stop();

		// Top casting
		Car c2 = new BMW();// child class object can be refereed by parent class
							// reference variable.
		c1.engine();// Parent class reference variable can not access child
					// class object which is not
		// common in both child class as well as in parent class
		c2.fillFuel();
		c2.start();
		c2.stop();

		// Down casting : not allowed. it will give classcastException

		// BMW b=new Car();//can not covert car to BMW
		BMW b = (BMW) new Car();
		b.autoParking();
		b.engine();
		b.fillFuel();
		b.start();
		b.stop();
	}

}
