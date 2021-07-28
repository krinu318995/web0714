package Day10;

import java.util.Scanner;

//슈퍼클래스로 사용함
public class Account {

	private String accountNumber;
	private int accountPassword;
	private int credit;// 예금액

	// ----------------------getter, setter
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(int accountPassword) {
		this.accountPassword = accountPassword;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	// --------------------------------constructor
	public Account() {

	}

	public Account(String accountNumber, int accountPassword, int credit) {
		super();
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.credit = credit;
	}

	// -----------------------------------method

	// 계좌 생성
	public void createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌번호 ->");
		String number = scanner.next();
		System.out.println("비밀번호 설정->");
		int password = scanner.nextInt();
		System.out.println("초기 예금액 ->");
		int money = scanner.nextInt();

		// 객체화
		Account account = new Account(number, password, money);

		// 배열
		for (int i = 0; i < Day10_3.accounts.length; i++) {
			if (Day10_3.accounts[i] == null) {
				Day10_3.accounts[i] = account;
				System.out.println("계좌생성이 완료됐습니다.");
				return;// 메서드 종료
			} // end of if

		} // end of for
		System.out.println("계좌 생성 실패 | 관리자에게 문의바랍니다.");

	}// end of create method

	// 입금
	public void deposit(String accountNumber) {

		System.out.println("입금할 게좌번호를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		System.out.println("계좌 비밀번호를 입력하세요");
		int password = scanner.nextInt();
		int result = findAccount(accountNumber);
		if (result == -1) {
			return;
		}
		
		Day10_3.accounts[result].accountNumber = number;

	}

	// 출금
	public void withdraw() {

	}

	// 이체
	public void transfer() {

	}

	// 계좌조회
	public int findAccount(String accountNumber) {
		// 검색한 계좌가 저장된 인덱스 번호를 반환
		// 매개변수 : 메서드가 시작되면서 메서드로 들어오는 데이터
		// 검색할 계좌번호

		for (int i = 0; i < Day10_3.accounts.length; i++) {
			if (Day10_3.accounts[i] != null && Day10_3.accounts[i].accountNumber.equals(accountNumber)) {
				return i;
			}
		}
		return -1;

	}
}
