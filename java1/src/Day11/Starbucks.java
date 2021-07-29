package Day11;

public class Starbucks implements Kiosk {

	@Override
	public void menu() {
		System.out.println("스타벅스 메뉴 페이지");

	}

	@Override
	public void shopping_basket() {
		System.out.println("장바구니");

	}

	@Override
	public void payment() {
		System.out.println("스타벅스 결제 페이지");

	}

	@Override
	public void termination() {

		Kiosk.super.termination();
	}

}
