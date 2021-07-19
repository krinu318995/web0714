package Day02;

/* Day 01 remind
 * main method : 
 * 코드를 읽어주는 역할 [thread 포함]
 */
public class Day02_1 {// start of class
	public static void main(String[] args) {// main start

		// 2진수 : 0, 1
		// 10진수 : 0-9
		// 8진수 : 0-7
		// 16진수 : 0-15(0-f)

		// 1bit : 0 or 1
		// 1byte[메모리 기본 단위] => 8bit [01010101]
		// 1kb :
		// 1mb :
		// 1gb :

		// ascii code : 2진수 -> 문자 변환 방식[영어]
		// 7bit : 128문자 표현 가능
		// 1byte =>영어
		// 유니코드[java] : 2진수 -> 문자 변환 방식[전세계 공용어]
		// 2byte => 한글

		// 변수(variable) : 데이터를 저장하는 공간
		// 사람 : 1. 상자의 크기 2. 상자 이름 3. 상자에 들어가는 값 4.
		// 컴퓨터 : [메모리 = 저장 장치(자원)
		// 1. 메모리 주소 [메모리 식별 or 변수 식별] = 16진수
		// 2. 메모리 크기 [byte단위]
		// 3. 메모리 데이터 |
		// 자료형 : 메모리의 크기를 미리 정해놓음
		// 사용하는 이유 : 효율적인 메모리 사용을 위해 [메모리 용량 증가 => 속도 저하]

		// 변수 선언과 변수 초기화
		int variable1 = 10;
		boolean logic = true;
		System.out.println(logic);
		char var1 = 'a';
		char var2 = 65;
		char var3 = 95;
		byte byteVar1 = 'd';
		byte byteVar2 = 100;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("byteVar1 : " + byteVar1);
		System.out.println("byteVar2 : " + byteVar2);

		short shortVar1 = 100;
		short shortVar2 = 'a';
		System.out.println("shortVar2 : " + shortVar2);
		System.out.println(shortVar1);

		// int : java 정수 타입 기본 단위
		int intVar = 100;
		System.out.println("intVar : " + intVar);
		int intVar2 = 'a';
		System.out.println("intVar2 : " + intVar2);

		System.out.println("java 정수 타입 기본 단위 : " + 10);

		// long
		long longVar1 = 10000000000000L;
		System.out.println("longVar1 : " + longVar1);

		// float
		float floatVar = 10.511111111111111111111111111f;
		System.out.println("floatVar = 10.511111111111111111111111111f == " + floatVar);

		// java 실수 기본 단위 : double
		double doubleVar = 10.5;
		System.out.println("doubleVar : " + doubleVar);

		// 기본 자료형에 문자열은 포함되지 않음, char만 있음
		// 문자열 방법 1. 배열
		char[] charArr = new char[10];
		charArr[0] = 'C';
		charArr[1] = 'H';
		charArr[2] = 'A';
		charArr[3] = 'R';
		charArr[4] = 'A';
		charArr[5] = 'C';
		charArr[6] = 'T';
		charArr[7] = 'O';
		charArr[8] = 'R';
	for(int i = 0; i<charArr.length; i++) {
		System.out.println(charArr[i]);
	}
		// 문자열 방법 2. 클래스
	}// end of main
}// end of class
