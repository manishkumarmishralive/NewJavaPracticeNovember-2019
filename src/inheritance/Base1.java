package inheritance;

//But, if we want to call parameterized constructor of base class, then we can call it using super(). 
//The point to note is base class constructor call must be the first line in derived class constructor.
//For example, in the following program, super(_x) is first line derived class constructor.

public class Base1 {
	int x;

	Base1(int _x) {
		this.x = _x;
	}

}
