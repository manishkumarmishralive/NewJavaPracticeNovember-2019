package staticAndNonStaticConcept;

public class StaticBlocksConcept {
	static String name = "Ajay";
	static int age = 26;
	static int id = 29567;
	static int a = 10;
	static int b;

	static {
		System.out.println("static block initialized.");
		b = a * 10;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
	}

}
// o/p
// static block initialized.
// from main
// Ajay
// 26
// 29567
// Value of a is:10
// Value of b is:100

// Static variables:

// When a variable is declared as static, then a single copy of variable is
// created and shared
// among all objects at class level. Static variables are, essentially, global
// variables. All instances
// of the class share the same static variable.
//
// Important points for static variables :-
//
// We can create static variables at class-level only.
// static block and static variables are executed in order they are present in a
// program.

// Static nested classes :
// We can not declare top-level class with a static modifier,
// but can declare nested classes or inner class as static. Such type of classes
// are called
// Nested static classes.

// When to use static variables and methods?
// Use the static variable for the property that is common to all objects.
// Example-college name of the student