package Day02;

import java.util.Scanner;
//import : 다른 파일에 있는 라이브러리[클래스]를 갖고옴
//import 패키지명.클래스
public class Day02_2 {
	public static void main(String[] args) {
		//1. Scanner 클래스 : 입력관련 클래스
		
		Scanner scanner/*2. 입력받은 값 넘겨 받음*/  = new Scanner(System.in)/*1. 입력 받음*/;//메모리 할당
			//1. Scanner : 입력과 관련된 메서드 제공
			//2. scanner : 객체의 이름 [임의의 값]
			//3. new : 객체의 메모리 할당 연산자
			//4. Scanner() : 클래스의 생성자
		
		System.out.println("정수 입력");
		
		//1. 변수 생성
		int input1;
		//2. 변수에 입력값 저장
		input1= scanner.nextInt();//3. 넘겨 받은 값 변수에 저장
		//3. 변수 출력
		System.out.println("입력받은 정수 : "+input1);
		System.out.println();
		System.out.println("문자열 입력");
		String stringObj = scanner.next();//String은 객체임
		System.out.println("입력받은 문자열 : "+stringObj);
		
		scanner.nextLine();
		System.out.println("공백 포함 입력 ");
		String stringObj2 = scanner.nextLine();
		System.out.println("공백 포함 문자열 : "+stringObj2);
		
	}
}
