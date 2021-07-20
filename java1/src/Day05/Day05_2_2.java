package Day05;

import java.util.Scanner;

public class Day05_2_2 {
//피라미드
	public static void main(String[] args) {

		System.out.println("정수");
		Scanner scanner = new Scanner(System.in);

		int layer = scanner.nextInt();

		for (int i = 1; i <= layer; i++) {
			for (int b = 1; b <= layer - i; b++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= i * 2 - 1; s++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
