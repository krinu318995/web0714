package Day17;

import java.util.HashSet;
import java.util.Scanner;

public class Day17_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> intHash = new HashSet<Integer>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {

			System.out.println("정수 입력");
			int num = scanner.nextInt();
			if (intHash.contains(num)) {
				System.out.println("중복값 입력 불가능");
				i--;
			} else {
				intHash.add(num);
			}
		}

		for (int i : intHash) {
			System.out.println(i);
		}

	}
}
