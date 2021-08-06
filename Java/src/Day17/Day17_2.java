package Day17;

import java.util.LinkedList;
import java.util.Scanner;

public class Day17_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LinkedList<Integer> reservePeople = new LinkedList<Integer>();

		while (true) {
			System.out.println("==========대기 명단=========");
			System.out.println("\t" + "대기번호" + "\t" + "인원수");
			System.out.println();
			for (int i = 0; i < reservePeople.size(); i++) {

				System.out.println("\t" + (i + 1) + "\t" + reservePeople.get(i));
			}
			System.out.println("1. 대기 추가 2. 대기 취소 3. 입장");

			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("인원수를 입력해주세요");
				int reserve = scanner.nextInt();

				reservePeople.add(reserve);
				System.out.println("대기번호 :  " + reservePeople.size());

			}
			if (menu == 2) {
				System.out.println("대기 취소 하시겠습니까?");
				System.out.println("1. 확인 2. 취소");
				int confirm = scanner.nextInt();
				if (confirm == 1) {
					System.out.println("취소할 대기번호를 입력해주세요");

					int number = scanner.nextInt();

					reservePeople.remove((number - 1));
					System.out.println("취소됐습니다.");
	
				}

			}
			if (menu == 3) {
				System.out.println("");
			}
			if (menu == 4) {
				System.out.println("대기 명단 확인");
				System.out.println(reservePeople);
			}

		}
	}

}
