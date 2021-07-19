package Day03;

import java.util.Scanner;

public class Day03_5 {
// 90점 이상 -> A
// 80점 이상 -> B
// 70점 이상 -> C
// 60점 이상 -> D
// 그 외의 점수 F
	public static void main(String[] args) {
		System.out.println("점수 입력");
		Scanner scanner= new Scanner(System.in);
				
	int score = scanner.nextInt();
	
	if(score>=90) {
		System.out.println("A");
	}else if(score >=80) {
		System.out.println("B");
	}else if(score>=70){
		System.out.println("C");
	}else if(score >= 60) {
		System.out.println("D");
	}else
		System.out.println("F");
	}
}
