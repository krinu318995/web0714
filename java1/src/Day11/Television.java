package Day11;

public class Television implements Remotecontroller {

	// implements : 인터페이스와 연결

	// 클래스 ->
	// 멤버 : 필드, 생성자, 메서드

	int noise = 0;

	@Override
	public void execution() {
		// 실행
		System.out.println("텔레비전 실행");

	}

	@Override
	public void termination() {
		// 종료
		System.out.println("텔레비전 종료");

	}

	@Override
	public void noiseSetting(int noise) {

		if (noise > max) {
			noise = Remotecontroller.max;
		}

		if (noise < min) {
			noise = Remotecontroller.min;

		} else {
			this.noise = noise;
		}
		System.out.println("현재 소음 : " + noise);
	}

	@Override
	public void changeChannel() {
		// 채널 변경
		Remotecontroller.super.changeChannel();
	}

}
