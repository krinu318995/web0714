package Day15;

public class User1 extends Thread {

	private Account account;

	public void setAccount(Account account) {

		this.setName("USER1");
		this.account = account;

	}

	@Override
	public void run() {
		account.setMoney(542100);
	}
}
