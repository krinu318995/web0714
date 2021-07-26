package Day08;

public class Day08_1 {
	public static void main(String[] args) {
		// java 는 100% 객체지향 언어
		// 객체 : 설계도(=클래스)로 만들어진 모든 객체

		// class : 객체를 정의하는 틀, 객체를 위한 설계도
		// 모든 클래스는 object 클래스로부터 시작됨

		// class = field(변수, 객체) + constructor + method

		// 1. 회원가입 설계도
		// 상태[field] : 아이디, 이름, 비밀번호, 이메일
		// 생성자[constructor] : 객체 생성시 필드의 초기값 유무, 필수 아님
		// 행동[method] : 회원가입 처리, 로그인, 아이디 찾기, 비밀번호 찾기, 회원 탈퇴 ...

		// 멤버 객체 선언 [클래스명 객체명 = new 생성자();]
		// new : 객체 선언시 메모리 할당 연산자
		// 생성자 : 클래스에 생성자가 없을 경우 빈생성자 자동으로 들어감

		//객체 생성시 필드에 데이터 없이 생성
		Member member = new Member();

		// 객체 내 멤버 접근시 [ . 접근 연산자 ]
		// 멤버 : 필드, 생성자, 메서드
		System.out.println(member.id);

		// 생성자를 이용한 객체 생성시 미리 필드에 데이터 입력
		Member member2 = new Member("dobby1", 1234, "dobby@gmail.com", "dobby", "dobby");
		System.out.println(member2.id);

		// 생성자를 이용한 객체 선언
		Member member3 = new Member("Dobby1111", 1234);
		System.out.println(member3.id);
		
		member.signUp();
		// 2. 게시판 설계도
	}
}
