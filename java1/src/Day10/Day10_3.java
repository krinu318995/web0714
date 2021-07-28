package Day10;

import java.util.Scanner;

public class Day10_3 {

	// ATM 클래스

	// 다른 클래스, 다른 패키지에서 사용할 수 있도록 main밖에 선언
	public static Account[] accounts = new Account[100];// 계좌 객체 100개를 저장하는 클래스

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. 신한은행 \t 2. 국민은행");

			int bankSelect = scanner.nextInt();
			while (true) {
				System.out.println("1. 계좌 생성");
				System.out.println("2. 송금");
				System.out.println("3. 출금");
				System.out.println("4. 계좌 이체");

				int select = scanner.nextInt();

				// 계좌 생성
				if (bankSelect == 1 && select == 1) {
					Shinhan shinhan = new Shinhan();
					shinhan.createAccount();
				}
				
				
			} // end of 2nd while

		} // end of 1st while
	}
}
