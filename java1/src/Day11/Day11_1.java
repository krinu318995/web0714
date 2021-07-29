package Day11;

public class Day11_1 {
	public static void main(String[] args) {
		// 리모컨 객체 생성
		Remotecontroller remotecontroller;

		remotecontroller = new Television();

		remotecontroller.execution();

		remotecontroller.termination();

		remotecontroller.noiseSetting(90);

		remotecontroller = new Audio();

		remotecontroller.execution();
		remotecontroller.noiseSetting(-500);
		remotecontroller.termination();

		remotecontroller = new SmartTelevision();
		remotecontroller.execution();
		remotecontroller.noiseSetting(5);
		remotecontroller.termination();

	}
}
