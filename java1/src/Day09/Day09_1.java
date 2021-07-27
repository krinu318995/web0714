package Day09;

public class Day09_1 {

	public static void main(String[] args) {

		// 클래스
		// 멤버 : 필드, 생성자, 메서드
		// 접근제한자 :
		// 목적 : 필드[메모리]의 데이터 보호
		// public : 현재 프로젝트 내에서 호출 가능
		// protected : 현재 패키지 내에서만 호출 가능함, 단 상속받은 서브 클래스는 슈퍼클래스가 있는 패키지로 접근 가능함
		// 패키지 : 자바 파일을 저장한 폴더
		// default : 어떠한 접근제한자도 설정 하지 않은 경우, 현재 패키지 내에서만 호출 가능함
		// private : 현재 클래스 내에서만 호출 가능

		// 게임 속 캐릭터 == 객체

		// 클래스 이름의 첫글자는 대문자
		// 클래스 객체는 소문자로

		Character character = new Character();
		character.name = "dobby";
		character.level = 100;
		character.exp = 900000;
		// character.power ------> priavte이라 직접 접근 불가능함
		character.setPower(800000000);

		character.showInfo();

		// 자주 사용되는 키워드
		// final : 특정 메모리 상수값, 초기값 설정한 후 변경 불가능함
		// 변수 <-----> 상수
		// static : 정적 변수[고정 변수], 프로그램 시작과 동시에 메모리 할당(static 영역),
		// 프로그램 종료와 동시에 메모리 초기화, static의 남용은 메모리의 낭비를 야기함
		// 프로그램 전반적으로 사용될 경우, 다른 static 객체에서 사용할 경우 사용

		// final : 변경 불가능 character.code = 0;

		// JAVA에서 메모리 구조
		// Heap : 메모리 [변수/객체] : new, 변수 생성
		// Static : 전역 변수 [static 키워드] : 
		// Stack : 지역 변수 [method] : 메서드가 종료되면 메모리 초기화, 일회용
	}
}
