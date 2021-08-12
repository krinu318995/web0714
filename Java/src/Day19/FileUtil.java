package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

	static String memberpath = "C:/Users/User/git/web0714/Java/src/Day19/memberlist.txt";// 회원 리스트
	static String boardpath = "C:/Users/User/git/web0714/Java/src/Day19/boardlist.txt";// 게시판
	static String replypath = "C:/Users/User/git/web0714/Java/src/Day19/replylist.txt";// 댓글

	// 멤버 로그
	static String logpath = "C:/Users/User/git/web0714/Java/src/Day19/logpath.txt";
	// 게시물 로그
	static String logpath2 = "C:/Users/User/git/web0714/Java/src/Day19/logpath2.txt";
	// 댓글 로그
	static String logpath3 = "C:/Users/User/git/web0714/Java/src/Day19/logpath3.txt";

	// 파일 저장 메서드
	public static void filesave(int type, int contents) throws Exception {
		// 인수 : type : 저장파일 구분용
		FileOutputStream outputStream = null; // 선언만

// 파일출력스트림 : FileOutputStream

		// 멤버 리스트를 파일에 저장
		if (type == 1) {
			outputStream = new FileOutputStream(memberpath);
// 리스트 => 하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기 
			for (Member member : ConsoleProgram.memberList) { // "," : 필드구분용 // "\n":회원구분용
				String outstring = member.getUserNumber() + "," + member.getId() + "," + member.getPassword() + ","
						+ member.getName() + "," + member.getEmail() + "," + member.getPoint() + "\n";
				outputStream.write(outstring.getBytes()); // 바이트로 변환후 쓰기
			}
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기
		}
		// 게시물 리스트를 파일에 저장
		if (type == 2) {
			outputStream = new FileOutputStream(boardpath);

			for (Board board : ConsoleProgram.boardList) {
				String outstring = board.getNumber() + "," + board.getTitle() + "," + board.getContents() + ","
						+ board.getWriter() + "," + board.getBdate() + "," + board.getCount() + "\n";
				outputStream.write(outstring.getBytes());
			}
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기
		}
		// 댓글 리스트를 파일에 저장
		if (type == 4) {
			outputStream = new FileOutputStream(replypath);

			for (Reply reply : ConsoleProgram.replyList) {
				String outString = reply.getrNumber() + ", " + reply.getBoardNumber() + ", " + reply.getContents()
						+ ", " + reply.getWriter() + "\n";

				outputStream.write(outString.getBytes());
			}

			outputStream.flush();
			outputStream.close();
		}

		// 멤버 전체 수
		if (type == 0) {
			outputStream = new FileOutputStream(logpath);
			String outstring = contents + "\n";
			outputStream.write(outstring.getBytes());

			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기
		}
		// 게시물 전체 수
		if (type == 3) {
			outputStream = new FileOutputStream(logpath2);
			String outstring = contents + "\n";
			outputStream.write(outstring.getBytes());
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기
		}
		// 댓글 로그
		if (type == 5) {
			outputStream = new FileOutputStream(logpath3);
			String outString = contents + "\n";
			outputStream.write(outString.getBytes());
			outputStream.flush();
			outputStream.close();
		}

	}

// 파일호출 메소드 
	public static void fileload(int type) throws Exception {
		FileInputStream fileInputStream = null;
		if (type == 1) {
// 1. 
			fileInputStream = new FileInputStream(memberpath); // 파일입력스트림에 파일연결 [ 메모리 할당 ]
// 2. 스트림(단위:바이트) 바이트 로 읽어오기
			byte[] bytes = new byte[10000]; // 10kb 정도 배열
			fileInputStream.read(bytes);
// 3. 문자열 변환 [ 바이트 => 문자열 ]
			String instring = new String(bytes);
// 4. 회원 분리하기 \n
			String[] members = instring.split("\n"); // [마지막 회원은 공백]
// 5. 반복문 이용한 회원내 필드 분리
			for (int i = 0; i < members.length - 1; i++) {
				String[] field = members[i].split(","); // 회원마다 필드간 분리
// 6. 분해된 필드를 객체로 생성 
				Member member = new Member(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4],
						Integer.parseInt(field[5]));
// 7. 각 객체를 리스트 담기
				ConsoleProgram.memberList.add(member);
			}
			fileInputStream.close(); // 스트림 닫기
		}

		// 게시물
		if (type == 2) {
			fileInputStream = new FileInputStream(boardpath);
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] boards = instring.split("\n"); // 게시물 분리
			for (int i = 0; i < boards.length - 1; i++) {
				// 마지막(공백) 제외
				String[] field = boards[i].split(",");
				Board board = new Board(Integer.parseInt(field[0]), field[1], field[2], field[3], field[4],
						Integer.parseInt(field[5]));
				ConsoleProgram.boardList.add(board);
			}
			fileInputStream.close(); // 스트림 닫기
		}

		if (type == 4) {
			fileInputStream = new FileInputStream(replypath);
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);
			String inString = new String(bytes);
			String[] replys = inString.split("\n");// 댓글 분리

			for (int i = 0; i < replys.length - 1; i++) {
				String[] field = replys[i].split(", ");// 필드별 분리

				Reply reply = new Reply(Integer.parseInt(field[0]), Integer.parseInt(field[1]), field[2], field[3]);
				ConsoleProgram.replyList.add(reply);
			}
			fileInputStream.close();

		}

		// 게시물 로그
		if (type == 3) {
			fileInputStream = new FileInputStream(logpath2);
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			Board.totalNumber = Integer.parseInt(log[0]);
			fileInputStream.close();

		}

		// 멤버 로그
		if (type == 0) {
// 1. 
			fileInputStream = new FileInputStream(logpath);
// 2. 스트림(단위:바이트) 바이트 로 읽어오기
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
// 3. 문자열 변환 [ 바이트 => 문자열 ]
			String instring = new String(bytes);
			String[] log = instring.split("\n");
// 4. 숫자열 변환 후 회원번호 넣기 
			Member.totalNumber = Integer.parseInt(log[0]);
			fileInputStream.close();
		}

		// 댓글로그
		if (type == 5) {
			fileInputStream = new FileInputStream(logpath3);

			byte[] bytes = new byte[1024];

			String inString = new String(bytes);
			String[] log = inString.split("\n");

			Reply.totalReply = Integer.parseInt(log[0]);
			fileInputStream.close();
		}

	}

}
