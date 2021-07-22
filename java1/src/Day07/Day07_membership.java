package Day07;

import java.util.Scanner;

public class Day07_membership {

	public static void main(String[] args) {
		// 회원가입
		// 로그인

		// 조건 1. 2차원 배열, 최대 회원 100명
		// 조건 2. 아이디, 비밀번호만 저장
		// 조건 3. 무한 루프 [초기 메뉴]
		// 1. 회원가입
		// 2. 로그인
		// 3. 종료
		// 조건 4. 로그인시 메뉴 바뀜
		// 1. 회원 탈퇴
		// 2. 비밀번호 변경

		Scanner scanner = new Scanner(System.in);

		String[][] member = new String[2][100];
		boolean b = true;
		while (b) {
			// 회원가입
			System.out.println("[ 1.회원가입\t 2.로그인\t\t 3.종료 ]");

			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("=============회원가입=============");
				System.out.print("아이디 : ");
				String id = scanner.next();

				System.out.print("비밀번호 : ");
				String password = scanner.next();

				boolean idCheck = true;

				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.err.println("중복된 아이디 입니다.");
						idCheck = false;
						break; // 가장 가까운 반복문 탈출
					}
				}

				if (idCheck) {
					for (int i = 0; i < member.length; i++) {
						if (member[i][0] == null) {
							member[i][0] = id;
							member[i][1] = password;
							System.out.println("회원가입 완료");
							break;
						}

					}

				}

			}

			// 로그인
			if (menu == 2) {

				System.out.print("아이디 : ");
				String id = scanner.next();
				System.out.print("비밀번호 : ");
				String password = scanner.next();

				boolean loginId = true;
				for (int i = 0; i < member.length; i++) {
					// 2차원 배열인 경우 행 길이
					// member[i].length : 열 길이

					for (int j = 0; j < member[i].length; j++) {

					}
				}

				break;
			}

			if (menu == 3) {
				b = false;
				System.out.println("종료합니다.");
			}

		} // end of while

	}// end of main
}// end of membership class
