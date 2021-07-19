package BackJoon;

import java.util.Scanner;

public class No0006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두 개의 정수를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = a + b;
		int sub = a - b;
		int mul = a + b;
		int div = a / b;
		int remainder = a % b;
		System.out.println(a + "+" + b + " 두 정수의 합은 " + sum + "입니다.");

	}
}
