package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_2 {

	public static void main(String[] args) {

		// 틱택토 console

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();// 랜덤 클래스 이용, 랜덤 객체 생성

		String[] game = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };

		while (true) {// 종료 조건 : 승자 발생, 9개의 알이 위치
			// 승리 조건 :
			// 가로 : [1 2 3] , [4 5 6] , [7 8 9]
			// 세로 : [1 4 7] , [2 5 8] , [3 6 9]
			// 대각선 : [1 5 9], [3 5 7]

			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]);
				if ((i + 1) % 3 == 0) {
					System.out.println();
				}
			}

			// 플레이어에게 위치 선택받아 알 두기
			while (true) {
				System.out.println("위치 선택");
				int position = scanner.nextInt();

				System.out.println("");

				if (game[position - 1].equals("[ ]")) {
					game[position - 1] = "[O]";
					break;// 가장 가까운 반복문 탈출
				} else {
					System.out.println("이미 둔 자리 입니다.");
				}
			}
			// 컴퓨터가 난수를 생성해서 알 생성
			while (true) {
				int rIndext = random.nextInt(9) + 1; // 0-9
				// 랜덤객체.nextInt(수)+시작; "시작"부터 "수" 전 까지

				if (game[rIndext] == "[ ]") {
					game[rIndext] = "[x]";
					break;
				}
			}
		}

	}
}
