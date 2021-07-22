package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();// 난수 생성 객체
		int[] pick = new int[6];
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int lotto = random.nextInt(45) + 1;// 정수 난수 생성 | 추첨 번호 생성
			boolean b = false;
			for (int temp : arr) {
				if (temp == lotto) {
					i--;
					b = true;
					break;

				}
			}
			if (b) {
				arr[i] = lotto;
			}
		}

		for (int temp : arr) {
			System.out.println(temp + " ");
		}

		// 추첨 결과

		int get = 0;
		for (int temp : pick) {
			for (int tmep2 : arr) {
				if (temp == tmep2) {
					get++;
				}
			}
			System.out.println("당첨 갯수 : " + get);
		}
	}
}
