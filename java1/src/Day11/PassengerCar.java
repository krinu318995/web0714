package Day11;

public class PassengerCar extends Car {
	Tire frontLeft = new Kumhotire("앞, 왼쪽", 10);
	public static void main(String[] args) {
	

	}

	public void checkTire() {
		System.out.println(frontLeft.toString());
	}

}
