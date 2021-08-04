package Day15;

import java.awt.Toolkit;

public class AnotherSound implements Runnable {
	// interface는 항상 추상메서드(abstract method)를 갖고 있음

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

}
