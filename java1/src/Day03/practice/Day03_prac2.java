package Day03.practice;

import java.util.Scanner;

public class Day03_prac2 {
//하나의 정수를 입력받아 입력 받은 숫자가 홀수인지 확인
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		int number = scanner.nextInt();
		System.out.println(number + "은(는) 홀수이다 " + (number % 2 != 0));

	}
}
