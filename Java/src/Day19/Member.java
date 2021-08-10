package Day19;

public class Member {

	// 필드

	private int userNumber;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;

	// 생성자
	public Member() {
		// 빈 생성자
	}

	// 회원가입할 때 사용
	public Member(int userNumber, String id, String password, String name, String email, int point) {
		// 모든 객체를 받는 생성자
		this.userNumber = userNumber;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.point = point;
	}

	// getter, setter
	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 메서드

	// 회원가입
	// 입력 받기 => 필드 저장 => 객체 => 리스트
	public void signUp() {
		// 아이디
		System.out.println("아이디(10자 이내)");
		String id = ConsoleProgram.scanner.next();
		// 비밀번호
		System.out.println("비밀번호(5글자 이내)");
		String password = ConsoleProgram.scanner.next();
		// 비밀번호 확인
		System.out.println("비밀번호 확인");
		String passwordConfirm = ConsoleProgram.scanner.next();
		// 이름
		System.out.println("이름");
		String name = ConsoleProgram.scanner.next();
		// 이메일
		System.out.println("이메일");
		String email = ConsoleProgram.scanner.next();

		// 유효성 검사
		// 중복 체크

		// 비밀번호 확인
		if (!password.equals(passwordConfirm)) {
			System.err.println("[알림 : 가입 실패] 비밀번호를 확인해주세요");
			return;
		}
		// 아이디 제약
		if (id.length() < 3 || id.length() > 10) {
			System.err.println("[알림 : 가입 실패] 아이디는 4-10글자 이내로 생성해주세요");
			return;
		}
		// 비밀번호 제약
		if (password.length() != 5) {
			System.err.println("[알림 : 가입 실패] 비밀번호의 길이는 5글자로 생성해주세요");
			return;
		}
		// 이름
		if (name.length() < 1 || name.length() > 11) {
			System.err.println("[알림 : 가입 실패] 이름은 2-10글자만 입력 가능합니다.");
			return;
		}
		// 이메일
		if (!email.contains("@")) {
			System.err.println("[알림 : 가입 실패] 아이디 형식에 맞지 않습니다.");
			return;
		}

		int totalNumber = 0;// 회원 고유번호, 회원 탈퇴해도 유지됨

		Member member = new Member(totalNumber + 1, id, passwordConfirm, name, email, 0);
		ConsoleProgram.memberList.add(member);// 리스트 담기

		try {
			FileUtile.fileSave(0, member.getUserNumber());
			FileUtile.fileSave(1, 0);
		} catch (Exception e) {
			System.err.println("파일처리 오류, 회원가입 실패");
		}
		System.out.println("회원가입 성공");

	}

	// 아이디 찾기
	public void findId() {

	}

	// 비밀번호 찾기
	public void findPassword() {

	}

	// 이메일
	public void sendEmail() {

	}

}
