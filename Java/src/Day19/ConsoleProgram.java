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
	static ArrayList<Reply> replyList = new ArrayList<Reply>();

	static Scanner scanner = new Scanner(System.in);
	// System.in -> 입력장치로부터 들어오는 byte(String 단위) -> scanner 클래스 객체에 저장
	// .next() : 객체에 저장된 byte를 string으로
	// .nextInt() : byte -> int
	// .nextDouble() : byte -> double

	void start() {

		try {
			FileUtil.fileload(1);
			FileUtil.fileload(2);
			FileUtil.fileload(4);
			// 여기서 불러오지 않으면 프로그램을 재시작할 때 파일 날라감 꼭 여기서 로드해줘야함
		} catch (Exception e) {
			System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 ");
		}

		while (true) {
			System.out.println("\n[[[ 회원제 커뮤니티 ]]]");
			System.out.print("[[[ 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기 선택 : ");
			try {
				int ch = scanner.nextInt();
				Member temp = new Member(); // 회원용 메소드 호출용 객체
				Board temp2 = new Board(); // 게시판 메소드 호출용 객체
				if (ch == 1) {

					Member login = temp.login();
					// 로그인 메소드 호출되고 반환 : 로그인성공시 객체 / 실패시 null
					if (login != null) {

						while (true) {
							// 게시물 게시물 출력
							temp2.view();
							System.out.println("[[[ 1.게시물등록 2.게시물조회 3.회원정보[수정/탈퇴] 4.로그아웃 ]] ");
							int ch2 = scanner.nextInt();
							if (ch2 == 1) {
								temp2.boardwrite(login);
							}
							if (ch2 == 2) {
								temp2.detail(login);
							}
							if (ch2 == 3) {
							}
							if (ch2 == 4) {
								System.out.println("[[[ 로그아웃 되었습니다 ]]]");
								login = null; // 로그인된정보 null 바꾸기
								break; // 반복문 탈출
							}
						}

					} else {
						System.out.println(" 로그인 실패 ");
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
