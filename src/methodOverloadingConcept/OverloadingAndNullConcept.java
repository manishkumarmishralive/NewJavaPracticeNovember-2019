package methodOverloadingConcept;

public class OverloadingAndNullConcept {

	public static void main(String[] args) {
		OverloadingAndNullConcept ob = new OverloadingAndNullConcept();
		// ob.sum(null);//it will give compile time error

		// it will not give compile time error
		Integer arg = null;
		ob.sum(arg);

	}

	public void sum(Integer i) {
		System.out.println("sum with Integer parameter");
	}

	public void sum(String name) {
		System.out.println("sum with String parameter");
	}

}
