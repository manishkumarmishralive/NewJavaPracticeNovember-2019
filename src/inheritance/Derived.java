package inheritance;

public class Derived extends Base1 {
	int y;

	Derived(int _x, int _y) {
		super(_x);
		this.y = _y;
	}

	public void display() {
		System.out.println("x:" + x + "\ny:" + y);
	}

}
