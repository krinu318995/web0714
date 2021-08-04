package Day15;

import java.awt.Toolkit;

public class Day15_Thread {

	public static void main(String[] args) {

		// 강아지 소리
		Thread thread1 = new Thread(new Runnable() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("강아지 소리" + (i + 1));

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("고양이 소리" + (i + 1));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("호랑이 소리" + (i + 1));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		Thread mainThread = Thread.currentThread();
		System.out.println("스레드 이름: " + mainThread.getName());

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("강아지 소리 : " + thread1.getName());
		System.out.println("고양이 소리 : " + thread2.getName());
		System.out.println("호랑이 소리 : " + thread3.getName());

	}// end of main

}
