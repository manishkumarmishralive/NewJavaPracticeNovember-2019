package interfaceAndAbstract;

public class TestBank {

	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		ic.carLoan();
		ic.credit();
		ic.debit();
		ic.educationLoan();
		ic.homeLoan();
		ic.insurence();
		ic.mutualFunds();
		ic.transfermoney();
		System.out.println(USBank.min_balance);

		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.transfermoney();

	}

}
