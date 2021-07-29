package Day11;

public class Bank implements ATM {

	String account_number ;
	int credit;
	
	@Override
	public void menu() {
		System.out.println("1.계좌 등록");
		System.out.println("2.예금");
		System.out.println("3.출금");
		System.out.println("4.이체");
		System.out.println("5.잔고");
	}

	@Override
	public void account_registration() {
		System.out.print("계좌 등록 페이지\n");

	}

	@Override
	public void deposit() {
		System.out.print("예금 페이지\n");
	}

	@Override
	public void withdraw() {
		System.out.print("출금 페이지\n");

	}

	@Override
	public void transfer() {
		System.out.print("이체 페이지\n");
		}

	@Override
	public void balance() {
		System.out.print("잔고 확인 페이지\n");

	}

}
