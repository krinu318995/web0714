package Day05;

public class Day05_1 {
	// 반복문
	// for, while, do-while

	// 1. for
	// for : 어디서부터 어디까지 어떻게 증가하면서 반복실행 할 것인지
	// for(조기값, 조건문, 증감식) { 실행문 }
	// 증감식 i++, i = i+1, i+=1 다 사용 가능함
	public static void main(String[] args) {

		int sum = 0;
		// ex1)
		for (int i = 0; i <= 50; i++) {
			sum += i;
		}
		System.out.println();
		System.out.println(sum);

		for (int j = 1; j <= 50; j++) {
			System.out.print(j);

			if (j % 10 != 0) {
				System.out.print(", ");
			}
			if (j % 10 == 0) {
				System.out.println();
			}
		}

		System.out.println();

		for (int k = 1; k <= 50; k += 3) {
			System.out.print(k + " ");
		}

		System.out.println();
		int sumA = 0;
		for (int a = 1; a <= 50; a++) {
			if (a % 7 == 0) {
				sumA += a;
			}
		}

		System.out.println(sumA);

	}
}
