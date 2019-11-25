package interfaceAndAbstract;

public interface USBank {
	int min_balance = 100;

	public void debit();

	public void credit();

	public void transfermoney();

	// Interfaces specify what a class must do and not how. It is the blueprint
	// of the class.

	// If a class implements an interface and does not provide method bodies for
	// all functions specified in the
	// interface, then the class must be declared abstract.

	// no method body--only method declaration
	// method prototype
	// can not create object of the interface
	// no static method
	// but interface variables static and final in nature by default
	// abstraction--100%
	// class can extends one class but implements multiple interface

	// Why do we use interface ?
	//
	// It is used to achieve total abstraction.
	// Since java does not support multiple inheritance in case of class, but by
	// using interface it can achieve multiple inheritance .
	// It is also used to achieve loose coupling.
	// Interfaces are used to implement abstraction. So the question arises why
	// use interfaces when we have abstract classes?
	// The reason is, abstract classes may contain non-final variables, whereas
	// variables in interface are final, public and static.

	// Important points about interface or summary of article:
	//
	// We can’t create instance(interface can’t be instantiated) of interface
	// but we can make reference of it that refers to the Object of its
	// implementing class.
	// A class can implement more than one interface.
	// An interface can extends another interface or interfaces (more than one
	// interface) .
	// A class that implements interface must implements all the methods in
	// interface.
	// All the methods are public and abstract. And all the fields are public,
	// static, and final.
	// It is used to achieve multiple inheritance.
	// It is used to achieve loose coupling.

}
