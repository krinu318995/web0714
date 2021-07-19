package Day02;

import java.util.Scanner;

public class Day02_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("학생의 이름 입력");
		String student1 = scanner.next();
		System.out.println(student1 + "학생의 국어점수 입력");
		int korScore = scanner.nextInt();
		System.out.println(student1 + "학생의 수학점수 입력");
		int mathScore = scanner.nextInt();
		System.out.println(student1 + "학생의 영어점수 입력");
		int engScore = scanner.nextInt();
	
		System.out.println("학생의 이름 입력");
		String student2 = scanner.next();
		System.out.println(student2 + "학생의 국어점수 입력");
		int kor_Score = scanner.nextInt();
		System.out.println(student2 + "학생의 수학점수 입력");
		int math_Score = scanner.nextInt();
		System.out.println(student2 + "학생의 영어점수 입력");
		int eng_Score = scanner.nextInt();
		
		System.out.println("=============점수표=============");
		System.out.println("이름\t국어\t수학\t영어");
		System.out.println(student1+"\t"+korScore+"\t"+mathScore+"\t"+engScore);
		System.out.println(student2+"\t"+kor_Score+"\t"+math_Score+"\t"+eng_Score);

	}
}
