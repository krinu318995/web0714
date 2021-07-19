package Day03.practice;

import java.util.Scanner;

public class Day03_prac8 {
//키를 정수로 입력받아 표준 몸무게 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해 주세요 단 소숫점 아래는 생략합니다.");
		int height = scanner.nextInt();
		
		double standard = (height-100)*0.9;
				System.out.println("키 "+height+"의 표준 체중은 "+standard+"입니다."); 
	}
}
