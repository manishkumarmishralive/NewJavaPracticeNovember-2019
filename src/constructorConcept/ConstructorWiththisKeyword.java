package constructorConcept;

public class ConstructorWiththisKeyword {
	// clas vars
	String name;
	int age;

	public ConstructorWiththisKeyword(String name, int age) {
		// this keyword is used to initialize the current class instance
		// variables
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWiththisKeyword obj = new ConstructorWiththisKeyword("tom", 10);

	}

}
