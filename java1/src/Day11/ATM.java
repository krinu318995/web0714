package Day11;

public interface ATM {

	public void menu();

	// 계좌 등록
	public void account_registration();

	// 예금
	public void deposit();

	// 출금
	public void withdraw();

	// 이체
	public void transfer();

	// 잔고
	public void balance();

}
