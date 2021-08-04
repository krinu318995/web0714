package Day15;

public class CheckThread extends Thread {

	// 스레드 이름 부여
	public CheckThread(String name) {
		setName(name); // setName() <= Thread 클래스에서 갖고옴
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {

		}
		System.out.println(getName());
		//스레드 끝나면 이름 출력
	}
}
