package Day03.practice;

import java.util.Scanner;

public class Day03_prac7 {
//사다리꼴의 넓이
	public static void main(String[] args) {
		System.out.println("윗변과 아랫변과 높이의 길이를 차례로 입력");
		Scanner scanner = new Scanner(System.in);

		double upper = scanner.nextDouble();
		double lower = scanner.nextDouble();
		double height = scanner.nextDouble();
		double area= ((upper*lower)*height)/2;
		
		System.out.println("사다리꼴의 높이 : "+area);
	}
}
