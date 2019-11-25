package interfaceAndAbstract;

public class ICICIBank implements USBank, RBI {

	@Override
	public void educationLoan() {

	}

	@Override
	public void homeLoan() {

		System.out.println("icici--homeLoan");
	}

	@Override
	public void carLoan() {

		System.out.println("icici--carLoan");
	}

	@Override
	public void debit() {

		System.out.println("icici--debit");
	}

	@Override
	public void credit() {
		System.out.println("icici--credit");

	}

	@Override
	public void transfermoney() {

		System.out.println("icici--transfermoney");
	}

	// Non-overridden method
	public void mutualFunds() {
		System.out.println("icici--mutualFunds");
	}

	public void insurence() {
		System.out.println("icici--insurence");
	}
}
