package Day11;

public class Lotteria implements Kiosk {

	@Override
	public void menu() {
		System.out.println("롯데리아 메뉴 페이지");

	}

	@Override
	public void shopping_basket() {
		System.out.println("장바구니");

	}

	@Override
	public void payment() {
	System.out.println("롯데리아 결제 페이지");
	}

	@Override
	public void termination() {
		// TODO Auto-generated method stub
		Kiosk.super.termination();
	}

}
