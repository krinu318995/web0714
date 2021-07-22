package Day07;

import java.util.Scanner;

public class Day07_3 {
	public static void main(String[] args) {
		// 사용자가 1-45 사이의 숫자를 6개 입력
		// 중복 없이
		// 1-45의 숫자만 가능

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			int user = scanner.nextInt();
			if (user >= 1 && user <= 45) {

				
				for (int temp : arr) {
					if (temp == user) {
						System.out.println("중복 불가능");
						i--;
						flag = true;
						break;
					}
					if (flag) {
						arr[i] = user;
					}

				}

			} else {
				System.out.println("정상적인 입력이 아님");
				i--;
				continue;
			}

		}

	}
}
