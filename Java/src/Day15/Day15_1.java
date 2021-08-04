package Day15;

import java.awt.Toolkit;

public class Day15_1 {

	// thread : 프로세스 내에서 실행되는 흐름의 단위, 운영체제의 자원
	// process : 연속적으로 실행중인 프로그램
	// program : 작업을 주행하는 명령어[code]집합

	public static void main(String[] args) throws InterruptedException {
		// 1. single thread

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();// 경보음 소리내는 녀석
			Thread.sleep(1000);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("일");

			Thread.sleep(1000); // 스레드 일시정지 (msec : 1000 => 1sec)
		}

		// 2. Multi thread
		// Thread 클래스
		// run method : 멀티 스레드 실행 코드
		// start : 멀티 스레드의 시작 [run method 실행]

		// 병행처리 : [컴퓨터 : 멀티x]
		Thread thread = new Sound();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("BEEP");
			thread.sleep(1000);
		}

		// 3. multi thread(interface 사용)

		System.out.println("multi thread (interface)");
		Runnable runnable = new Sound();
		Thread thread2 = new Thread(runnable);
		// thread 클래스에 thread 인터페이스 넣음
		thread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("BEEP");
			thread2.sleep(1000);
		}
	}// end of main
}
