package Day11;

public class KB extends Bank {
	@Override
	public void menu() {
		System.out.println("국민은행");
		super.menu();
	}

	@Override
	public void account_registration() {
		System.out.print("국민은행 ");
		super.account_registration();
	}

	@Override
	public void deposit() {
		System.out.print("국민은행 ");
		super.deposit();
	}

	@Override
	public void withdraw() {
		System.out.print("국민은행 ");
		super.withdraw();
	}

	@Override
	public void transfer() {
		System.out.print("국민은행 ");
		super.transfer();
	}

	@Override
	public void balance() {
		System.out.print("국민은행 ");
		super.balance();
	}
}
