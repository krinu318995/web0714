package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtile {

	static String memberpath = "C:/Users/User/git/web0714/Java/src/Day19/memberlist.txt";
	static String logpath = "C:/Users/User/git/web0714/Java/src/Day19/logpath.txt";

	// 파일 저장 메서드
	public static void fileSave(int type, int contents) throws Exception {
		// type : 저장파일 구분용
		FileOutputStream outputStream = null;// 선언만 함
		//파일 출력 스트림 : 

		if (type == 1) {
			outputStream = new FileOutputStream(memberpath);
			
			//new FileOutputStream(경로);
			// list=>하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기
			
			//"\n" 회원 구분용
			//"," 필드 구분용
			for (Member member : ConsoleProgram.memberList) {
				String outStream = member.getUserNumber() + ", " + member.getId() + ", " + member.getPassword() + ", "
						+ member.getName() + ", " + member.getEmail() + ", "+member.getPoint() + "\n";
				outputStream.write(outStream.getBytes());// 바이트로 변환 후 쓰기
			}
			
			outputStream.flush(); //스트림 안에 있는 바이트 제거 : 초기화
			outputStream.close(); //스토림 닫기
		}

		if (type == 0) {
			outputStream = new FileOutputStream(logpath);
			String outString = contents + "\n";
			outputStream.write(outString.getBytes());
			
			outputStream.flush(); //스트림 안에 있는 바이트 제거 : 초기화
			outputStream.close(); //스토림 닫기
		}

	}

	// 파일 호출 메서드
	public static void loadFile(int loadtype) throws Exception {
		FileInputStream inputStream = null;
		if (loadtype == 1) {
			inputStream = new FileInputStream(memberpath);

			byte[] byteArray = new byte[1024000];// 파일 크기 임의로 지정
			inputStream.read(byteArray);
			
			// 1. 문자열로 변환
			String fileContents = new String(byteArray);

			// 2. 회원별 분류
			String[] members = fileContents.split("\n");

			// 3. 필드별 분류
			for (String member : members) {
				if (member.equals("")) {
					// \n이 하나의 조각으로 들어가기 때문에 공백에서 종료하도록

					return;
				}

				String[] fields = member.split(",");
				Member temp = new Member(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4],
						Integer.parseInt(fields[5]));

				ConsoleProgram.memberList.add(temp);

			} // end of for
			inputStream.close();
			//스트림 닫기
		} // end of if

		else if (loadtype == 0) {
			inputStream = new FileInputStream(logpath);
			byte[] byteArray = new byte[1024];
			inputStream.read(byteArray);

			Member.totalNumber = new Integer(new String(byteArray));
		}
		inputStream.close();
	}

}
