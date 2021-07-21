package Day06;

import java.util.Scanner;

public class Day06_1 {
	// switch
	// 1. (key)에 해당하는 case를 찾은 후 아래 case를 모두 실행
	// 2. break; : switch or 반복문 탈출
	// 3. 경우의 수가 정해져 있는 경우 switch
	// 4. 경우의 수가 주어지지 않은 경우 if

	public static void main(String[] args) {

		System.out.println("->");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		switch (number) {

		case 90:
			System.out.println("90점 입니다.");
			break;

		case 80:
			System.out.println("80점 입니다.");
			break;

		case 70:
			System.out.println("70점 입니다.");
			break;

		default:
			System.out.println("불합격 입니다.");
		}
		/////////////////////////////////////////////////////////////////////////

		if (number == 90) {
			System.out.println("90점 입니다.");
		} else if (number == 80) {
			System.out.println("80점 입니다.");
		} else if (number == 70) {
			System.out.println("70점 입니다.");
		} else if (number == 60) {
			System.out.println("60점 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}

		// for : 조건에 따른 반복실행
		// for (초기값 ; 조건문 ; 증감식)
		// while : 조건에 따른 반복 실행 , 무한루프
		// while(조건문){ }

		System.out.println("for");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			if (i == 6) {
				break;
			}
			if (i < 9) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("while");
		int j = 0;
		while (j < 10) {
			j++;
			if (j == 6) {
				continue;
			}
			System.out.print(j);
			if (j < 10) {

				System.out.print(", ");
			}
		}
	}
}
