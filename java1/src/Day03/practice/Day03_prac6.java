package Day03.practice;

import java.util.Scanner;

public class Day03_prac6 {
//두 개의 실수를 입력받아 앞의 숫자가 뒤의 숫자의 몇퍼센트인지 확인
		//%.숫자f  -> 숫자 : 소숫점의 자리수
			//ex> %.2f : 소숫점 2자리
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 개의 실수 입력");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		double per = (a/b)*100;
		
		System.out.println(a+"는 "+b+"의 "+per+"% 이다.");
		System.out.printf("%.4f%%", per);
		
	}
}
