package Day19;

public class Start {
	public static void main(String[] args) {
		// 메모리 할당
		// 1. static(정적변수)
		// 2. 객체화: new연산
		// case 1
		// ConsoleProgram.start();//static으로 지정한것만
		// case 2
		ConsoleProgram consoleProgram = new ConsoleProgram();// 클래스의 모든 필드들이 메모리에 올라옴
		//new 뒤에 오는애들이 생성자
		consoleProgram.start();
	}
}
