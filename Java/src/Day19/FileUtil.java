package Day19;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

	static String memberpath = "C:/Users/User/git/web0714/Java/src/Day19/memberlist.txt";// 회원 리스트
	static String boardpath = "C:/Users/User/git/web0714/Java/src/Day19/boardlist.txt";// 게시판

	static String logpath = "C:/Users/User/git/web0714/Java/src/Day19/logpath.txt";
	static String logpath2 = "C:/Users/User/git/web0714/Java/src/Day19/logpath2.txt";

	// 파일 저장 메서드
	public static void fileSave(int type, int contents) throws Exception {
		// type : 저장파일 구분용
		FileOutputStream outputStream = null;// 선언만 함
		// 파일 출력 스트림 :

		if (type == 1) {
			outputStream = new FileOutputStream(memberpath);

			// new FileOutputStream(경로);
			// list=>하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기

			// "\n" 회원 구분용
			// "," 필드 구분용
			for (Member member : ConsoleProgram.memberList) {
				String outStream = member.getUserNumber() + ", " + member.getId() + ", " + member.getPassword() + ", "
						+ member.getName() + ", " + member.getEmail() + ", " + member.getPoint() + "\n";
				outputStream.write(outStream.getBytes());// 바이트로 변환 후 쓰기
			}

			outputStream.flush(); // 스트림 안에 있는 바이트 제거 : 초기화
			outputStream.close(); // 스토림 닫기
		}

		if (type == 2) {
			outputStream = new FileOutputStream(boardpath);

//			private static int number = 0; // 게시물 번호
//			private String title;// 제목
//			private String contents;// 내용
//			private String writer;// 작성자
//			private String bdate; // 작성일
//			private int count;// 조회수

			for (Board board : ConsoleProgram.boardList) {
				String outStream = board.getNumber() + ", " + board.getTitle() + ", " + board.getContents() + ", "
						+ board.getWriter() + ", " + board.getBdate() + ", " + board.getCount() + "\n";

				outputStream.write(outStream.getBytes());// 바이트로 변환 후 쓰기
			}

			outputStream.flush(); // 스트림 안에 있는 바이트 제거 : 초기화
			outputStream.close(); // 스토림 닫기
		}

		if (type == 0) {
			outputStream = new FileOutputStream(logpath);
			String outString = contents + "\n";
			outputStream.write(outString.getBytes());

			outputStream.flush(); // 스트림 안에 있는 바이트 제거 : 초기화
			outputStream.close(); // 스토림 닫기
		}

		if (type == 3) {
			outputStream = new FileOutputStream(logpath2);
			String outString = contents + "\n";
			outputStream.write(outString.getBytes());

			outputStream.flush();
			outputStream.close();
		}
	}

	// 파일 호출 메서드
	public static void loadFile(int loadtype) throws Exception {
		FileInputStream inputStream = null;
		if (loadtype == 1) {

			inputStream = new FileInputStream(memberpath);// 파일 입력스트림에 파일 연결 [메모리 할당]
			// 2. 스트림 (단위 : byte) 바이트로 읽어오기

			byte[] bytes = new byte[10000];
			inputStream.read(bytes);

			// byte -> String
			String inString = new String(bytes);

			// 회원별 구분
			String[] members = inString.split("\n");// 마지막 회원 공백
			for (int i = 0; i < members.length - 1; i++) {
				String[] field = members[i].split(", ");// 필드별 구분
				Member member = new Member(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4],
						Integer.parseInt(field[5])

				);

				ConsoleProgram.memberList.add(member);

			} // end of for
			inputStream.close();
		} // end of if

		if (loadtype == 2) {
			inputStream = new FileInputStream(boardpath);

			byte[] bytes = new byte[10000];
			inputStream.read(bytes);

			String inString = new String(bytes);
			// 게시물별 분류
			String[] boards = inString.split("\n");
			for (int i = 0; i < boards.length - 1; i++) {
				String[] field = boards[i].split(", ");// 필드별 구분

//				private static int number = 0; // 게시물 번호
//				private String title;// 제목
//				private String contents;// 내용
//				private String writer;// 작성자
//				private String bdate; // 작성일
//				private int count;// 조회수

				Board board = new Board(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4],
						Integer.parseInt(field[5]));

				ConsoleProgram.boardList.add(board);
			}

			inputStream.close();
		}

		if (loadtype == 3) {
			inputStream = new FileInputStream(logpath2);

			byte[] bytes = new byte[1024];
			inputStream.read(bytes);
			// byte -> String
			String inString = new String(bytes);

			String[] log = inString.split("\n");

			// 숫자열 변환 후 회원번호 넣기
			Board.number = Integer.parseInt(log[0]);
			inputStream.close();

		}

		if (loadtype == 0) {

			inputStream = new FileInputStream(logpath);

			byte[] bytes = new byte[1024];
			inputStream.read(bytes);
			// byte -> String
			String inString = new String(bytes);

			String[] log = inString.split("\n");

			// 숫자열 변환 후 회원번호 넣기
			Member.totalNumber = Integer.parseInt(log[0]);
			inputStream.close();

		}

	}

}
