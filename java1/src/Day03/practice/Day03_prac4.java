package Day03.practice;

import java.util.Scanner;

public class Day03_prac4 {
//입력받은 두 정수 대소관계 확인
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 2개 입력");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(a+">"+b +"\t"+ (a>b));
	}
}
