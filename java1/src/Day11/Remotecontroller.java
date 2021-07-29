package Day11;

public interface Remotecontroller {
	// 인터페이스 형태
	// 접근제한자 interface 인터페이스 이름 {}

	int max = 10;
	int min = 0;

	// 추상메서드 선언 O, 정의 X
	public void execution();

	public void termination();

	public void noiseSetting(int noise);

	// default 메서드 : 선언O, 정의 O
	public default void changeChannel() {
		System.out.println("채널 변경");
	}

}
