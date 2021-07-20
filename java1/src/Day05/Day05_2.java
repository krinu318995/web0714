package Day05;

import java.util.Scanner;

public class Day05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		int i = scanner.nextInt();

		for (int j = 1; j <= i; j++) {
			System.out.print("*");
			if (j % 5 == 0) {
				System.out.println();
			}
		}
	}
}
