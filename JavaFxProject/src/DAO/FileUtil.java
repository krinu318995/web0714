package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import Domain.List;
import Domain.Member;

public class FileUtil {
	// 파일 경로
	static String memberPath = "D:/Java_KNR/JavaFxProject/src/DAO/memberList.txt";

	public static void FileSave() throws Exception {

		// 파일처리 // DB
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(memberPath);
			// stream -> byte
			for (Member temp : List.members) {
				String outString = temp.getId() + ", " + temp.getPassword() + ", " + temp.getName() + ", "
						+ temp.getEmail() + ", " + temp.getPhoneNumber() + ", " + temp.getPoint() + "\n";
				fileOutputStream.write(outString.getBytes());

			}
			System.out.println("파일처리 완료");
			fileOutputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			e.getMessage();
			System.out.println("파일처리 실패");
		}
	}// end of fileSave

	public static void FileLoad() {
		try {
			FileInputStream fileInputStream = new FileInputStream(memberPath);
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);

			String inString = new String(bytes);
			String[] members = inString.split("\n");

			for (int i = 0; i < members.length - 1; i++) {
				// members.length-1 : \n때문에 생긴 공백 때문에 -1을 해야 함
				String[] field = members[i].split(", ");
				Member member = new Member(field[0], field[1], field[2], field[3], field[4],
						Integer.parseInt(field[5]));
				// point : int type, field : String type -> Integer.parseInt(field[5]) 정수타입으로 파싱
				// parse == 분석하다
				// 언어학에서 parsing은 구문 분석이라고도하며 문장을 그것을 이루고 있는 구성 성분으로 분해하고 그들 사이의 위계 관계를 분석하여 문장의
				// 구조를 결정하는 것
				List.members.add(member);
			}
			fileInputStream.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
