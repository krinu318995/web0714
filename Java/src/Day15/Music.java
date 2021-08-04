package Day15;

public class Music extends Thread {
	// 음악 재생 여부 확인 필드
	static boolean musicStart = true;

	// 음악 종료 메서드
	public static void musicStop(boolean start) {
		musicStart = start;
		if (musicStart) {
			System.out.println("음악 시작");
		} else {
			System.out.println("음악 종료");
		}
	}

	@Override
	public void run() {

		while (musicStart) {
			System.out.println("음악 재생중");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
