package Day15;

import java.awt.Toolkit;

public class Day15_1 {

	// thread : 프로세스 내에서 실행되는 흐름의 단위, 운영체제의 자원
	// process : 연속적으로 실행중인 프로그램
	// program : 작업을 주행하는 명령어[code]집합

	// 상속 vs 인터페이스
	// extends : 단일 상속만 가능 (클래스 하나만 상속 가능)
	// implements : 다중 상속 가능 ( n개의 인터페이스 상속 가능)

	public static void main(String[] args) throws InterruptedException {
		// 1. single thread

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();// 경보음 소리내는 녀석
			Thread.sleep(1000);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("일");
			if (i < 4) {
				System.out.print(", ");
			}
			Thread.sleep(1000); // 스레드 일시정지 (milli sec 기준 - 1000 msec => 1sec )
		}
		System.out.println();

		// 2. Multi thread
		// Thread 클래스
		// run() : 멀티 스레드 실행 코드
		// start() : 멀티 스레드의 시작 [run method 실행]
		// getName() : 스레드 이름
		// sleep() : 스레드 일시 정지

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
		System.out.println("멀티스레드");
		// 4. 멀티스레드
		// -----------메모리 할당-- 생성자
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {
					toolkit.beep();

					// try catch
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// end of try catch

				}
			}
		});

		thread3.start();
		System.out.println("Thread3");
		for (int i = 0; i < 5; i++) {
			System.out.println("BEEP");
			thread3.sleep(1000);
		}
	}// end of main
}
