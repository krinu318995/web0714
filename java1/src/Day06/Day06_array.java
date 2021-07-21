package Day06;

import java.util.Scanner;

public class Day06_array {

	public static void main(String[] args) {
		// 변수 : 메모리를 할당 받아 데이터를 저장하는 한 개의 공간
		// 배열 : 기준[index]에 따른 나열
		// 목적 : 동일한 자료형 or 클래스의 여러 메모리를 관리
		// index : 메모리가 저장된 순서 번호, 0부터 시작
		// 선언 : 자료형/클래스 [] = new 자료형/클래스[index];

		// 변수 : 자료형 [int, char, double, float, byte, short] 기반으로 선언
		// 객체 : 클래스 기반으로 선언

		// 컴파일 후 크기 변경 불가능 [정해져 있는 메모리 사용시 용이]
		int[] numberArr = new int[3];

		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i + 1;
			System.out.println(numberArr[i]);
		}

		// 배열 선언 2. 선언과 동시에 초기값 설정 (메모리 생성시 기본값)
		/* String : class */
		String[] stringArr = new String[5];
		// String : 객체
		// " . " : 접근연산자
		System.out.println(stringArr); // 메모리 주소 : 배열의 첫번쨰 인덱스
		System.out.println(stringArr.length);
		for (int i = 0; i < stringArr.length; i++) {
			stringArr[i] = "a" + i;
			System.out.println(stringArr[i]);

		}

		// 학생수를 입력받아 학생 수 만큼 배열의 길이 할당 :
		// 2. 메뉴 [ 1. 학생 수 2. 점수 입력 3. 분석 [등수, 평균] 4. 종료 ]

		System.out.println("메뉴 선택");

		Scanner scanner = new Scanner(System.in);

		int end = 0;
		int[] scoreList = null;
		int sum = 0;
		while (true) {

			System.out.println("[ 1. 학생 수 2. 점수 입력 3. 분석 [등수, 평균] 4. 종료 ]");
			int select = scanner.nextInt();

			switch (select) {

			case 1:
				System.out.println("학생 수를 입력해주세요");
				int count = scanner.nextInt();
				scoreList = new int[count];
				break;

			case 2:
				System.out.println("점수를 입력해주세요");

				for (int i = 0; i < scoreList.length; i++) {
					System.out.println(i + 1 + "번째 학생의 점수 입력");
					int score = scanner.nextInt();
					scoreList[i] = score;
				}
				break;

			case 3:
				System.out.println();
				// 합계
				for (int i = 0; i < scoreList.length; i++) {
					sum = sum + scoreList[i];
				}

				double avg = sum / (scoreList.length);
				// 등수
				for (int i = 1; i < scoreList.length; i++) {
					int temp = 0;
					if (scoreList[i - 1] < scoreList[i]) {
						temp = scoreList[i - 1];
						scoreList[i - 1] = scoreList[i];
						scoreList[i] = temp;
					}

				}

				for (int i = 0; i < scoreList.length; i++) {
					System.out.println((i + 1) + "등 : " + scoreList[i]);
				}

				System.out.println("평균 점수 : " + avg);
				break;

			case 4:
				System.out.println("종료합니다.");
				end = 1;
				break;

			default:
				System.out.println("잘못 선택했습니다.");
			}

		}

	}

}
