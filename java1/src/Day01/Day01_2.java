package Day01;

public class Day01_2 {// 클래스 시작

	// main 메서드는 thread이 포함됨
	public static void main(String[] args) {
		System.out.println(123); //숫자
		System.out.println("java");//문자열
		System.out.println("문자");//문자
		System.out.println("java 123");//문자 + 숫자
		/*
		 *  " " 처리 하는 이유 : 
		 *  컴퓨터가 모르는 단어(정의되지 않은 단어)
		 *  미리 정의된 키워드 or 숫자에는 문자 처리 X
		 *  문자 + 숫자 => 문자
		 */
		
		//System.out.println(); // 출력 후 자동 줄바꿈
		System.out.println("단어 출력 1 : println");
		//System.out.print(); // 출력만
		System.out.print("단어 출력 2 : print");
		//System.out.printf(); // 형식 : format 출력물 꾸미기 가능
		System.out.println("단어 출력 3 : printf");
		
		System.out.println("현재 나이 : "+40/*상수*/+"\n좋아하는 숫자 : "+4);
		System.out.printf("저의 나이는 %d"/*변수*/+"입니다. 그리고 좋아하는 숫자는 %d입니다. ", 40, 4);
		System.out.printf("현재 실수는 : %f\n",10.5);
		System.out.printf("현재 문자 : %c\n", 'A');
		System.out.printf("현재 문자열 : %s\n","HELLO WORLD");
		
		/*
		 * 형식 문자 : 
		 * %d : 정수
		 * %f : 실수
		 * %s : 문자열
		 * %c : 문자
		 */
		
		/* 제어 문자 : 
		 * \n : 줄 바꿈
		 * \t : 들여쓰기
		 * \r : 다음 줄의 첫칸으로 이동
		 * \" : "
		 * \\ : \
		 */
		System.out.println("\"");
		System.out.println("\\");
		//연산자[기호] 출력시 \연산자
		
		//예제 3
		System.out.println("\t[[[출석부]]]");
		System.out.println("이름\t1교시\t2교시\t3교시");
		System.out.println("도비\t출석\t결석\t출석");
		System.out.println("DOBBY\t결석\t출석\t출석");

		//문제1. 
		/*
		 *  \	/\
		 *   ) ( ')
		 *  (  /  )
		 *   \(___)|
		 */
		System.out.println("문제1\n\\    /\\\n )  ( ')\n(  /  )\n \\(___)|");
		
		//문제2. 
		/*	|\_/|
		 *  |q p|   /}
		 *  ( 0 )"""\
		 *  |"^"'	 |
		 *  ||_/=\\__|
		 *  
		 * 
		 */
		
		System.out.println("문제2\n|\\_/|\n|q p|   /}\n( o )\"\"\"\\\n|\"^\"'\t |\n||_/=\\\\__|");
	}
}// 클래스 끝
