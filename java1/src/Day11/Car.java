package Day11;

public class Car implements GearShift {

	// 필드
	Tire front_left = new Tire("front left", 5);
	Tire front_right = new Tire("front right", 10);
	Tire back_left = new Tire("back left", 0);
	Tire back_right = new Tire("back right", 4);

	public int driving() {
		System.out.println("주행중임 ᕕ( ⁰ ▽ ⁰ )ᕗ");

		if (front_left.turn() == false) {
			parking();
			return 1;// 고장난 위치
		}
		if (front_right.turn() == false) {
			parking();
			return 2;// 고장난 위치
		}
		if (back_left.turn() == false) {
			parking();
			return 3;// 고장난 위치
		}
		if (back_right.turn() == false) {
			parking();
			return 4; // 고장난 위치
		}

		return 0;// 이상없음

	}// end of method

	public void parking() {
		System.out.println("주차");
	}

	@Override
	public int neutrality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int back() {
		System.out.println("후진중임 ᕕ( ⁰ ▽ ⁰ )ᕗ");

		if (front_left.turn() == false) {
			parking();
			return 1;// 고장난 위치
		}
		if (front_right.turn() == false) {
			parking();
			return 2;// 고장난 위치
		}
		if (back_left.turn() == false) {
			parking();
			return 3;// 고장난 위치
		}
		if (back_right.turn() == false) {
			parking();
			return 4; // 고장난 위치
		}

		return 0;// 이상없음

	}
}
