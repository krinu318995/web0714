package Day11;

public class Day11_4 {
	public static void main(String[] args) {
		Car car1 = new Car();
		PassengerCar passengerCar = new PassengerCar();
		SUV suv = new SUV();

		for (int i = 1; i <= 10; i++) {
			int postion = car1.driving();

			switch (postion) {
			case 1:
				System.out.println("금호 타이어 교체");
				car1.front_left = new Kumhotire("앞 왼쪽", 10);
				break;

			case 2:
				System.out.println("금호 타이어 교체");
				car1.front_right = new Kumhotire("앞 오른쪽", 10);
				break;

			case 3:
				System.out.println("금호 타이어 교체");
				car1.back_left = new Kumhotire("뒤 왼쪽", 10);
				break;

			case 4:
				System.out.println("금호 타이어 교체");
				car1.back_right = new Kumhotire("뒤 오른쪽", 10);
				break;

			}
		}
	}

}
