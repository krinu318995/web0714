package Day04;

import java.util.Scanner;

public class Day04_1 {
//네 개의 정수를 입력받아 배열을 사용하지 않고 오름차순 정렬
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		int swap;

		System.out.println("before sorting");

		// a와 다른 변수들 비교
		if (a > b) {
			swap = a;
			a = b;
			b = swap;
		}

		if (a > c) {
			swap = a;
			a = c;
			c = swap;
		}

		if (a > d) {
			swap = a;
			a = d;
			d = a;
		}

		if (b > c) {
			swap = b;
			b = c;
			c = swap;
		}

		if (b > d) {
			swap = b;
			b = d;
			d = swap;
		}

		if (c > d) {
			swap = c;
			c = d;
			d = swap;
		}

		System.out.println("after sorting");
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
}
