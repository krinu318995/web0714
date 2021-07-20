package Day05;

public class Day05_1_2 {
	public static void main(String[] args) {
		// for 중첩
		// for1(){ for2(){ for3(){ } } }
		// 총 실행 횟수 : for1 조건 * for 2 조건 * for3 조건

		for (int i = 2; i <= 15; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				int cal = i * j;
				System.out.println(i + " x " + j + " = " + cal);
			}
			System.out.println();
		}
	}
}
