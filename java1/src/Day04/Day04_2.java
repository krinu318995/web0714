package Day04;

import java.util.Scanner;

public class Day04_2 {
//로그인 페이지
	// 아이디 : admin 비밀번호 : 1234
	// 아이디, 비밀번호 모두 일치할 경우 로그인 성공!
	// 입력한 아이디가 다를 경우 아이디가 다릅니다.
	// 비밀번호가 다를 경우 비밀번호가 다릅니다.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("[[[로그인 페이지]]]");
		System.out.print("아이디 : ");
		String id = scanner.nextLine();
		System.out.print("비밀번호 : ");
		int password = scanner.nextInt();

		if (id.equals("admin")) {// 문자열[클래스]은 비교 연산자를 사용할 수 없음
			//String 클래스 비교 메서드 : 문자열.equals("비교대상")
			if (password == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 다릅니다.");
			}
		} else {
			System.out.println("아이디가 다릅니다.");
		}
	}
}
