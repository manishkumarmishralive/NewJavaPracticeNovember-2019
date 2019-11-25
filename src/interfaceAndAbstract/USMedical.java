package interfaceAndAbstract;

public interface USMedical extends WHO {

	int min_fee = 10;

	public void physioService();

	public void onchologyServices();

	public void orthopadicServices();

	// if we declaring same method in more than one interface then we don't need
	// to override more time --we need to override one time only
	public void radiologyServices();

	// we can not create object of interface or instantiate

	// only method declaration: method prototype--no method body
	// can not create static prototype method in interface--In interface method
	// is public and abstract

	// But interface variables are public static and final by default
	// static method can not be override that's the reason interface method
	// without method body can not be static
	// One interface can extend another interface by using extend keyword

	// From JDK 1.8 we can have static and default method in interface but with
	// method body
	// static method with static method
	// we can not override both these method
	// default can not be static
	public static void Servies_911() {
		System.out.println("US--Servies_911");

	}

	public default void internShip() {
		System.out.println("US--internShip...");
	}

}
