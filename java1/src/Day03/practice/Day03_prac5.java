package Day03.practice;

import java.util.Scanner;

public class Day03_prac5 {
//반지름 입력받아 원의 넓이 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("반지름 입력");
		
		double a = scanner.nextDouble();
		
		int r = (int)a;
		
		double area = r*r*3.14;
		System.out.println("반지름이 "+r+"인 원의 넓이 : "+area);
	}
}
