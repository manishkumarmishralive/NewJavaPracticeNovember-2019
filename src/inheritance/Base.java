package inheritance;

public class Base implements INF3 {

	@Override
	public void start() {
		System.out.println("INF1--start");

	}

	@Override
	public void stop() {
		System.out.println("INF2--stop");

	}

	@Override
	public void refuel() {

		System.out.println("INF3--refuel");
	}

}
