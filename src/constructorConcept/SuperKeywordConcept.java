package constructorConcept;

public class SuperKeywordConcept {

	int max = 30;

	SuperKeywordConcept(int a, int b) {
		System.out.println("super class constructor");
	}

	public void start() {
		System.out.println("parent class--start");
	}
}

// The super keyword in java is a reference variable that is used to refer
// parent class objects.
// The keyword “super” came into the picture with the concept of Inheritance.

// 1. Use of super with variables: This scenario occurs when a derived class and
// base class has same data members.
// In that case there is a possibility of ambiguity for the JVM.

// 2.Use of super with methods: This is used when we want to call parent class
// method. So whenever
// a parent and child class have same named methods then to resolve ambiguity we
// use super keyword.

// 3.Use of super with constructors: super keyword can also be used to access
// the parent class constructor.
// One more important thing is that, ‘’super’ can call both parametric as well
// as non parametric constructors
// depending upon the situation.