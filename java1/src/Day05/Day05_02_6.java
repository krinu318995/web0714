package Day05;

import java.util.Scanner;

public class Day05_02_6 {
	// * 모래시계 모양 출력
	public static void main(String[] args) {

		System.out.println("정수 입력");
		Scanner scanner = new Scanner(System.in);

		int layer = scanner.nextInt();

		int star = 1;
		for (int i = 1; i <= layer; i++) {
//			System.out.print(i);

			for (star = 1; star <= layer; star++) {
				if (star <= i) {
					System.out.print("*");

				}
				else if((i + star) <=layer+1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
