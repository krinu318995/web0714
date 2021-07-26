package Day08;

public class Member {
	String id;
	int password;
	String nickname;
	String name;
	String email;

	// 생성자[객체 선언시 초기값]
	// 빈생성자
	public Member() {

	}

	public Member(String id, int password, String email, String name, String nickname) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.nickname = nickname;
		// this.멤버 : 현재 클래스의 멤버
		// 동일한 이름의 변수가 존재
	}

	// 특정 필드만 입력받는 생성자
	public Member(String id, int password) {
		this.id = id;
		this.password = password;
	}

	// 1. 필드 : 상태 [메모리]

	// 2. 생성자 : 객체 생성시 초기값 설정 유무

	// 3. 메서드 [함수] : 미리 만들어진 코드
	// 메서드 사용 목적 : 코드의 재활용 [빈번하게 사용되는 코드]
	// 미리 작성된 코드들로 구성된 집합
	// 인수와 반환
	// 인수 : 메서드 안으로 들어오는 데이터
	// 반환 : 메서드 밖으로 나가는 데이터[ 메서드 내 모든 메모리 초기화 -> return data]ㅇ
	// 메서드 안에서 선언되는 메로리는 메서드 종료시 초기화됨 [효율적인 메모리 사용]
	
	public void signUp() {
		//void : 반환타입 벗  
		System.out.println("id");
	}
	

}
