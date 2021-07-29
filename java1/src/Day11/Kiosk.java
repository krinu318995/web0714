package Day11;

public interface Kiosk {

	public void menu();

	public void shopping_basket();

	public void payment();

	public default void termination() {
		System.out.println("종료합니다.");
	}

}
