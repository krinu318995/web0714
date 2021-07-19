package Day03;

import java.util.Scanner;

public class Day03_6 {
//두 개의 정수를 입력받아 더 큰 수를 출력
	public static void main(String[] args) {
		
		Scanner scanner=  new Scanner(System.in);
		
		int a =scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.println("더 큰 수 : " +a);
		}else if(a==b) {
			System.out.println("두 수가 같음");
		}else {
			System.out.println("더 큰 수 : " +b);
		}
		
		System.out.println();
	}
}
