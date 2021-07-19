package Day04;

import java.util.Scanner;

public class Day04_3 {
//키오스크 프로그램
	// 금액을 입력받아 제품 구매

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int cokeStock = 10;
		int fantaStock = 10;
		int ciderStock = 10;

		int total;
		while (true) {
			int coke_number = 0;
			int fanta_number = 0;
			int cider_number = 0;

			int amountOfPayment = 0;
			while (true) {
				System.out.println("[[[자판기]]]");
				System.out.println("콜라 [300]\t환타[200]\t사이다[100]");

				System.out.println("선택 : ");

				int select = scanner.nextInt();
				if (select == 1) {
					if (cokeStock > 0) {
						System.out.println("[[[ 콜라 담았습니다 ]]]");
						coke_number++;
						cokeStock--;

					} else {
						System.out.println("콜라 재고 부족");
					}
				}

				if (select == 2) {
					if (fantaStock > 0) {
						System.out.println("[[[ 환타 담았습니다 ]]]");
						fanta_number++;
						fantaStock--;
					} else {
						System.out.println("환타 재고 부족");
					}
				}

				if (select == 3) {
					if (ciderStock > 0) {
						System.out.println("[[[ 사이다 담았습니다 ]]]");
						cider_number++;
						ciderStock--;
					} else {
						System.out.println("사이다 재고 부족");
					}
				}

				if (select == 4) {
					if (coke_number != 0 && fanta_number != 0 && cider_number != 0) {
						if (coke_number != 0) {
							System.out.println("콜라 개수 : " + coke_number + " 결제 금액 : " + coke_number * 300);
						}

						if (fanta_number != 0) {
							System.out.println("환타 개수 : " + fanta_number + " 결제 금액 : " + fanta_number * 200);
						}
						if (cider_number != 0) {
							System.out.println("사이다 개수 : " + cider_number + " 결제 금액 : " + cider_number * 100);
						}

						total = (coke_number * 300) + (fanta_number * 200) + (cider_number * 100);

						System.out.println("결제 하시겠습니까? 예[1]\t아니요[2]");
						int confirm = scanner.nextInt();
						if (confirm == 1) {
							System.out.println("금액 투여 ㅡ");
						}

					} else {
						System.out.println("결제하실 제품이 없습니다.");
					}
				}
			}
		}

	}
}
