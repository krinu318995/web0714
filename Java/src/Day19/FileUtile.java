package Day19;

import java.io.FileOutputStream;

public class FileUtile {

	static String memberpath = "C:/Users/User/git/web0714/Java/src/Day19/memberlist.txt";
	static String logpath = "C:/Users/User/git/web0714/Java/src/Day19/logpath.txt";

	// 파일 저장 메서드
	public static void fileSave(int type, int contents) throws Exception {
		// type : 저장파일 구분용
		FileOutputStream outputStream = null;// 선언만 함

		if (type == 1) {
			outputStream = new FileOutputStream(memberpath);
			// list=>하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기
			for (Member member : ConsoleProgram.memberList) {
				String outStream = member.getUserNumber() + ", " + member.getId() + ", " + member.getPassword() + ", "
						+ member.getName() + ", " + member.getEmail() + "\n";
				outputStream.write(outStream.getBytes());// 바이트로 변환 후 쓰기
			}
		}

		if (type == 0) {
			outputStream = new FileOutputStream(logpath);
			String outString = contents + "\n";
			outputStream.write(outString.getBytes());
		}

	}
	// 파일 호출 메서드
}
