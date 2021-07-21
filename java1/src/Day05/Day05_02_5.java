package Day05;

import java.util.Scanner;

public class Day05_02_5 {
	// X모양으로 * 출력
	public static void main(String[] args) {
		// 앞 공백 0, 1, 3, 5 ....
		// 중간 공백 5, 3, 1, 0
		// 행 열
		// 1 7
		// 2 6
		// 3 5
		// 4
		// 5 3
		// 2 6
		// 7 1
		System.out.println("높이 출력"); // 입력 받은 행과 열 동일함
		Scanner scanner = new Scanner(System.in);

		int line = scanner.nextInt();
		for (int i = 1; i <= line; i++) {
			System.out.print(i+ " ");
			for(int j = 1; j<=line ; j++) {
				if(i==j) {
					System.out.print(j);
				}
				else if((i+j) == (line+1)) {
					System.out.print(i+j);
				}
				else {
					System.out.print("!");
					
				}
			}System.out.println();

		}
	}
}
