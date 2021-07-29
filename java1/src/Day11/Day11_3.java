package Day11;

import java.util.Scanner;

public class Day11_3 {
	public static void main(String[] args) {
		ATM atm;
		/*
		 * 1.계좌 등록 2.예금 3.출금 4.이체 5.잔고 6.종료
		 */

		while (true) {
			System.out.println("1.국민은행 2.신한은행");
			Scanner scanner = new Scanner(System.in);
			int selectBank = scanner.nextInt();

			if (selectBank == 1) {
				atm = new KB();
				atm.menu();
				int selectMenu = scanner.nextInt();

				if (selectMenu == 1) {
					atm.account_registration();
				}
				if (selectMenu == 2) {
					atm.deposit();
				}
				if (selectMenu == 3) {
					atm.withdraw();
				}
				if (selectMenu == 4) {
					atm.transfer();
				}
				if (selectMenu == 5) {
					atm.balance();
				}
				if (selectMenu == 6) {
					System.out.println("종료합니다.");
					break;
				}
			}
		}
	}
}
