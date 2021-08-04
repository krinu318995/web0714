package Day15;

public class Movie extends Thread {

	static boolean movieStart = true;

	public static void movieStop(boolean start) {
		movieStart = start;
		if (movieStart) {
			System.out.println("영화 시작");
		} else {
			System.out.println("영화 종료");
		}
	}

	@Override
	public void run() {
		System.out.println("영화 재생중");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
