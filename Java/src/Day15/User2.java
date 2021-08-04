package Day15;

public class User2 extends Thread {

	private Account account;

	public void setAccount(Account account) {
		this.setName("USER2");
		this.account = account;
	}
	
	@Override
	public void run() {
		account.setMoney(512000);
		
	}
	
	
}
