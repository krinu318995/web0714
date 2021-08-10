package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleProgram {

	// 필드 : 변수, 객체, 인터페이스, 배열 .....
	// 1. 컬렉션 프레임워크 (회원, 게시물, 댓글 목록)
	// 생성자
	// 메서드
	// 1. Start(프로그램의 시작, 메뉴를 보여줌)
	// 프로그램 파일들간의 패키지 이동이 있음 -> public, 패키지 이동이 없음 -> default or protected
	// 다른 패키지에서 사용해야 함 - public

	// void 반환타입 X

	// 회원정보 저장할 리스트
	static ArrayList<Member> memberList = new ArrayList<Member>();

	
	static Scanner scanner = new Scanner(System.in);
	// System.in -> 입력장치로부터 들어오는 byte(String 단위) -> scanner 클래스 객체에 저장
	// .next() : 객체에 저장된 byte를 string으로
	// .nextInt() : byte -> int
	// .nextDouble() : byte -> double

	public void start() {
		while (true) {
			System.out.println("회원제 커뮤니티");
			System.out.println("1.로그인 2.회원가입 3.아이디 찾기 4.비밀번호 찾기");
			Member temp = new Member();
			try {
				int ch = scanner.nextInt();

				if (ch == 1) {

				}
				if (ch == 2) {
					temp.signUp();

				}
				if (ch == 3) {

				}
				if (ch == 4) {

				}

				if (ch > 4 || ch < 1) {
					System.err.println("잘못된 입력입니다.");

				}

			} catch (Exception e) {
				System.err.println("잘못된 입력입니다.");
				scanner = new Scanner(System.in);

			}
		}
	}
}
