package Day03.practice;

import java.util.Scanner;

public class Day03_prac10 {
//inch -> cm
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("길이 입력 (단위 inch)");
		int inch = scanner.nextInt();
		
		double cm  = inch*2.54;
		
		System.out.println(inch+"inch -> "+cm+"cm");
	}
}
