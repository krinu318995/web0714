package Day07;

public class Day07_2 {
	// 2차원 배열
	public static void main(String[] args) {
		int[][] arr = new int[3][2]; // 3행 2열

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 1행 //2행
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
				if (j < arr2[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		int[][] arr3 = new int[2][50];

		for (int num = 0; num < 100; num++) {
			if (num < 50) {
				arr3[0][num] = num;
			} else if (num >49){
				arr3[1][(num - 50)] = num;
			}
		}

		for (int i = 0; i < 100; i++) {

			if (i < 50) {
				System.out.print(arr3[0][i] + " ");
			} else {
				System.out.println(arr3[1][i - 50]);
			}
//			for (int j = 0; j < arr3[i].length; j++) {
//				System.out.print(arr3[i][j]);
//				if (j < arr2[i].length - 1) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
		}

	}
}
