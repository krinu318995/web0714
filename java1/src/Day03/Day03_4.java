package Day03;

import java.util.Scanner;

public class Day03_4 {
	// 합격 여부 확인
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();

		if (score >= 80) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}
}
