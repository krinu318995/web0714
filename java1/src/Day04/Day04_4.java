package Day04;

import java.util.Scanner;

public class Day04_4 {

//	  조건 1. 두 명의 플레이어가 가위, 바위, 보 중 하나를 입력받아 
//	  조건 2. 이긴 사람 출력

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("player1 가위/바위/보 선택");
		String player1 = scanner.nextLine();
		System.out.println("player2 가위/바위/보 선택");
		String player2 = scanner.nextLine();

		if (player1.equals("가위")) {
			if (player2.equals("가위")) {
				System.out.println("이긴 사람 없음");
			} else if (player2.equals("바위")) {
				System.out.println("이긴 사람 : player2");
			} else if (player2.equals("보")) {
				System.out.println("이긴 사람 : player1");
			}
		} else if (player1.equals("바위")) {
			if (player2.equals("가위")) {
				System.out.println("이긴 사람 : player1");
			} else if (player2.equals("바위")) {
				System.out.println("이긴 사람 없음");
			} else if (player2.equals("보")) {
				System.out.println("이긴 사람 : player2");
			}
		} else if (player1.equals("보")) {
			if (player2.equals("가위")) {
				System.out.println("이긴 사람 : player2");
			} else if (player2.equals("바위")) {
				System.out.println("이긴 사람 : player1");
			} else if (player2.equals("보")) {
				System.out.println("이긴 사람 없음");
			}
		}
	}
}
