package Day02;

import java.util.Scanner;

public class Day02_7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("금액 입력");
		int money = scanner.nextInt();

		int i = money;

		int a = money / 100000;// 십만원 개수
		int b = (money - (a * 100000)) / 10000;// 만원 개수
		int c = (money - (a * 100000) - (b * 10000)) / 1000;// 천원 개수
		int d = (money - (a * 100000) - (b * 10000) - (c * 1000)) / 100;// 백원 개수


		
		System.out.println(money + "=>");
		System.out.println("\t십만원 : " + a);
		System.out.println("\t만원 : " + b);
		System.out.println("\t천원 : " + c);
		System.out.println("\t백원 : " + d);

	}
}
