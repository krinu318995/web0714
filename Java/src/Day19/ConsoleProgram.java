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
	static ArrayList<Board> boardList = new ArrayList<Board>();

	static Scanner scanner = new Scanner(System.in);
	// System.in -> 입력장치로부터 들어오는 byte(String 단위) -> scanner 클래스 객체에 저장
	// .next() : 객체에 저장된 byte를 string으로
	// .nextInt() : byte -> int
	// .nextDouble() : byte -> double

	void start() {

		try {
			FileUtil.loadFile(1);
		} catch (Exception e) {
			System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 ");
		}

		while (true) {
			System.out.println("회원제 커뮤니티");
			System.out.println("1.로그인 2.회원가입 3.아이디 찾기 4.비밀번호 찾기");
			Member temp = new Member();
			Board temp2 = new Board();
			
			try {
				int ch = scanner.nextInt();

				if (ch == 1) {
					Member loginUser = temp.login();// 로그인 성공시 객체 / 실패시 null
					if (loginUser != null) {
						// 로그인 성공하면 게시판 페이지로
						System.out.println("로그인 성공");
						temp2.list(loginUser);
						
						loginUser=null;
					} else {
						System.out.println("로그인 실패");
					}
				}
				if (ch == 2) {
					temp.signUp();

				}
				if (ch == 3) {
					temp.findId();
				}
				if (ch == 4) {
					temp.findPassword();
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
