package Day05;

import java.util.Scanner;

public class Day05_2_3 {
	// 뒤집힌 피라미드
	public static void main(String[] args) {

		System.out.println("출력할 피라미드의 층 수");

		Scanner scanner = new Scanner(System.in);

		int layer = scanner.nextInt();

		for (int i = 1; i <= layer; i++) {// 층 수

			// 공백 : 0, 1, 2, 3, 4
			for (int b = 1; b <= i - 1; b++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= layer * 2 - (i * 2 - 1); s++) {
				System.out.print("*");
			} // 별의 개수 = 전체 줄 수 *2 -(i*2-1)
			System.out.println();

		}
	}
}
