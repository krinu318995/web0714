package Day03;

import java.util.Scanner;

public class Day03_7 {
//세 개의 숫자 중 최댓값 출력
	public static void main(String[] args) {

		System.out.println("정수 3개 입력");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("최댓값 : " + a);
			}
		} else if (b > a) {
			if (b > c) {
				System.out.println("최댓값 : " + b);
			}
		} else if (c > a && c>b) {
			System.out.println(c);
	
		}

	}
}
