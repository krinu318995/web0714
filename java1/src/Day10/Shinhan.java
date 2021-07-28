package Day10;

//신한은행
public class Shinhan extends Account {
	private final String bankCode = "101";

	public Shinhan() {
	}

	public Shinhan(String accountNumber, int accountPassword, int credit) {
		super(accountNumber, accountPassword, credit);
	}

	@Override
	public void createAccount() {
		System.out.println("신한은행 계좌 생성");
		super.createAccount();

	}

	@Override
	public void deposit(String accountNumber) {
		System.out.println("신한은행 입금 페이지");
		super.deposit(accountNumber);
	}

	@Override
	public void withdraw() {
		System.out.println("신한은행 출금 페이지");
		super.withdraw();
	}

	@Override
	public void transfer() {
		System.out.println("신한은행 송금 페이지");
		super.transfer();
	}

}
