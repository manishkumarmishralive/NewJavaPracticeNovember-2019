package encapsulation;

public class EmployeeData {
	// Private data variable: so that these variables can not accessed directly
	// from outside the class.
	private int ssn;
	private String name;
	private int age;

	// getters and setters method: to set and get the values of fields.
	// encapsulation is also known as data hiding
	// encapsulation is a part of OOP concept
	// Oops: Polymorphism, inheritance, encapsulation

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setName("Tom");
		emp.setAge(25);
		emp.setSsn(1234);
		System.out.println("Employee name is:" + emp.getName());
		System.out.println("Employee age:" + emp.getAge());
		System.out.println("Employee ssn no is:" + emp.getSsn());

	}

	// getters and setters method are always public
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
