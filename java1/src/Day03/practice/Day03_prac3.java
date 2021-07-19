package Day03.practice;

import java.util.Scanner;

public class Day03_prac3 {
//하나의 정수를 입력받아 입력 받은 숫자가 7의 배수이면서 짝수인지 확인
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		int number = scanner.nextInt();
		
		System.out.println(number+"은(는) 7의 배수 이면서 짝수이다."+((number%7==0) && (number%2==0)));
	}
}
