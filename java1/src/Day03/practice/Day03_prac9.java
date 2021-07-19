package Day03.practice;

import java.util.Scanner;

public class Day03_prac9 {
//키와 몸무게를 입력받아 bmi 출력
////BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextInt();
		int weight = scanner.nextInt();

		double bmi = (weight / ((height / 100) * (height / 100)));
		System.out.println("((height / 100) * (height / 100)) = "+((height / 100) * (height / 100)));
		System.out.println("bmi : " + bmi);

	}
}
