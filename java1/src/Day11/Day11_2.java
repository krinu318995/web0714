package Day11;

import java.util.Scanner;

public class Day11_2 {
	public static void main(String[] args) {

		// 인터페이스 선언
		Kiosk kiosk = null; // 초기값 null

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. 롯데리아 2. 스타벅스");
		int connect = scanner.nextInt();
		if (connect == 1) {
			kiosk = new Lotteria();
		}

		if (connect == 2) {
			kiosk = new Starbucks();
		}
		while (true) {
			System.out.println("키오스크");
			System.out.println("1. 메뉴 2.장바구니 3.결제 4.종료");

			int select = scanner.nextInt();

			if (select == 1) {
				kiosk.menu();
			}
			if (select == 2) {
				kiosk.shopping_basket();
			}
			if (select == 3) {
				kiosk.payment();
			}
			if (select == 4) {
				kiosk.termination();
				break;
			}

		}
	}
}
