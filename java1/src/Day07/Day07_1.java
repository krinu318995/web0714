package Day07;

public class Day07_1 {
	// 배열 : 동일한 자료형/클래스의 메모리 할당
	// 인덱스 : []
	// 1차원 배열 : 단행구조
	// 2차원 배열 : 행과 열이 존재함

	public static void main(String[] args) {
		// 반복문 사용, 0-99 int형 배열에 각 인덱스 저장하고 출력

		for (int i = 0; i < 100; i++) {
			int arr[] = new int[100];
			arr[i] = i;
			System.out.print(arr[i]);
			if (i % 10 == 9) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}

		System.out.println("===============================================================================");
		int intArr[] = new int[100];
		int i = 0;
		// for의 활용
		for (int temp : intArr) {

			i++;
			temp = i;
			System.out.print(temp);
			if (i % 10 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
}
