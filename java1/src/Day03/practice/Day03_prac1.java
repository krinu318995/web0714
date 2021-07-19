package Day03.practice;

import java.util.Scanner;

public class Day03_prac1 {
//입력한 숫자가 7의 배수인지 확인
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		int number = scanner.nextInt();
		
		System.out.println(number+"은(는) 7의 배수이다 "+(number%7==0));
	}
}
