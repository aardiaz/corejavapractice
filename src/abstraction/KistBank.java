package abstraction;

public class KistBank extends CentralBank {

	@Override
	protected void getBankName() {
		System.out.println("Kist Bank");
	}

	@Override
	protected void getInterestRate() {
		System.out.println("16%");
	}

}
