package Day15;

public class Account {

	private int money;
	// private : 현재 클래스에서만 접근 가능함

	public int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) {
		this.money = money;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.money);

	}

}
