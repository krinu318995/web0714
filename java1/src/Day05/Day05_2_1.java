package Day05;

import java.util.Scanner;

public class Day05_2_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");

		int a = scanner.nextInt();
		int i = 0;
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println();
		for (i = a; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 05
		
		/*
		 * 별 수 1, 공백 수 9(전체 줄 수  - 현재 줄 수) 
		 * 별 수 2, 공백 수 8
		 * 
		 * 
		 * 별 수 10, 공백 수 0
		 */
		
		//전체 줄 수 a
		for (i = 1; i <= a; i++) {
			// i = 현재 줄 수
			for (int b = 1; b <= a-i; b++) {
				System.out.print(" ");//범위만큼 공백 증가
			}
			for (int s = 1; s <= i; s++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println();

		// 06
		for (i = 1; i <= a; i++) {
			for (int b = 1; b <= i - 1; b++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= a - i+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
