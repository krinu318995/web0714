package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		UserList<Child> childList = new UserList<>("유아 명단");
		UserList<Youth> youthList = new UserList<>("청소년 명단");
		UserList<Adult> adultList = new UserList<>("성인 명단");
		while (true) {
			System.out.println("명단 관리");
			System.out.println(" 1.명단 등록 2.명단 출력");

			int ch = scanner.nextInt();

			// 명단 등록
			if (ch == 1) {
				System.out.println("이름");
				String name = scanner.next();
				System.out.println("나이");
				int age = scanner.nextInt();
				if (age < 8) {
					childList.add(new Child(name, age));
				} else if (age < 20) {
					youthList.add(new Youth(name, age));
				} else {
					adultList.add(new Adult(name, age));
				}
			}

			// 명단 출력
			if (ch == 2) {
				printUserList(childList);

				printUserList(youthList);

				printUserList(adultList);

			}
		}

	}

	public static void printUserList(UserList<?> users) {
		System.out.println(users.getListName());
		System.out.println(Arrays.toString(users.getUserList()));
	}
}
