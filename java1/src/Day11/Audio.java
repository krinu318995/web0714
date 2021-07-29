package Day11;

public class Audio implements Remotecontroller {

	int noise = 0;

	@Override
	public void execution() {
		System.out.println("오디오 실행");
	}

	@Override
	public void termination() {
		System.out.println("오디오 종료");

	}

	@Override
	public void noiseSetting(int noise) {

		if (noise > max) {
			noise = max;
		}
		if (noise < min) {
			noise = min;
		} else {
			this.noise = noise;
		}
		
		System.out.println("현재 소음 : "+noise);
	}

}
