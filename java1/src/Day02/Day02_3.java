package Day02;

import java.util.Scanner;

public class Day02_3 {
//두 명의 이름을 입력 받고 출석 여부 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름 입력");
		String student1 = scanner.next();
		System.out.println("1교시 출석");
		String period1 = scanner.next();
		System.out.println("2교시 출석");
		String period2 = scanner.next();
		System.out.println("3교시 출석");
		String period3 = scanner.next();

		System.out.println("학생의 이름 입력");
		String student2 = scanner.next();
		System.out.println("1교시 출석");
		String period_1 = scanner.next();
		System.out.println("2교시 출석");
		String period_2 = scanner.next();
		System.out.println("3교시 출석");
		String period_3 = scanner.next();
		System.out.println("============출석부============");
		System.out.println("이름\t1교시\t2교시\t3교시");
		System.out.println(student1 + "\t" + period1 + "\t" + period2 + "\t" + period3);
		System.out.println(student2 + "\t" + period_1 + "\t" + period_2 + "\t" + period_3);

	}
}
