package Day15;

public class Day15_Sync {

	// 동기화
	// n개의 스레드가 하나의 메모리에 접근할 때 순서 적용
	// 먼저 접근한 스레드가 종료되면 다음 스레드 실행
	// First In First Out
	

	public static void main(String[] args) {
		// 공동계좌
		Account account = new Account();

		User1 user1 = new User1();
		user1.setAccount(account);
		user1.start();

		User2 user2 = new User2();
		user2.setAccount(account);
		user2.start();

	}
}
