package Day19;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {

	// 필드

	private int userNumber;
	private String id;
	private String password;
	private String name;
	private String email;
	private int point;

	static int totalNumber = 0;// 회원 고유번호, 회원 탈퇴해도 유지됨

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

		// 아이디 중복 체크
		// 입력한 아이디가 리스트에 존재하면 안됨
		for (Member temp : ConsoleProgram.memberList) {
			if (temp.id.equals(id)) {
				System.out.println("[[알림 : 가입실패]] : 동일한 아이디가 존재합니다. ");
				return;
			}
		}
		// 유효성 검사
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
		try {
			// 회원가입 성공 : 객체 => 리스트 => 파일처리
			FileUtil.loadFile(0);
			Member member = new Member(totalNumber + 1, id, password, name, email, 0); // 객체
			ConsoleProgram.memberList.add(member);// 리스트담기

			FileUtil.fileSave(0, member.getUserNumber());
			FileUtil.fileSave(1, 0);
		} catch (Exception e) {
			System.out.println("[[파일처리 오류 ]] : 관리자에게 문의 ");
		}
		System.out.println("[[ 회원가입 성공 ]] : 가입해주셔서 감사합니다");
	}

	public Member login() {
		System.out.println("아이디");
		String id = ConsoleProgram.scanner.next();

		System.out.println("비밀번호");
		String password = ConsoleProgram.scanner.next();

		for (Member member : ConsoleProgram.memberList) {
			if (member.id.equals(id) && member.password.equals(password)) {
				System.out.println("안녕하세요" + member.name + "님");

				// 로그인된 회원의 정보를 넘김
				return member;// 반환타입 " 로그인된 회원 정보 객체 전달
			}
		}
		System.out.println("동일한 회원 정보가 없습니다.");
		return null;// 로그인 실패시 null
	}

	// 아이디 찾기
	// 입력받은 이름과 이메일이 동일하면 아이디 출력
	public void findId() {

		System.out.println("이름");
		String name = ConsoleProgram.scanner.next();
		System.out.println("이메일");
		String email = ConsoleProgram.scanner.next();

		for (Member member : ConsoleProgram.memberList) {
			if (member.name.equals(name) && member.email.equals(email)) {
				System.out.println("아이디 " + member.id);
				return;
			} else {
				System.out.println("일치하는 정보가 없습니다.");
				return;
			}
		}
	}

	// 비밀번호 찾기
	// 입력받은 아이디와 이메일이 동일한 경우 이메일로 임시 비밀번호 전송
	public void findPassword() {
		System.out.println("아이디");
		String id = ConsoleProgram.scanner.next();
		System.out.println("이메일");
		String email = ConsoleProgram.scanner.next();

		for (Member member : ConsoleProgram.memberList) {
			if (member.id.equals(id) && member.email.equals(email)) {
				System.out.println("임시 비밀번호를 이메일로 전송했습니다.");
				sendEmail(email, 1, password);// type 1 : 비밀번호 찾기
				return;
			}
		}
		System.out.println("일치하는 정보가 없습니다. 다시 확인해주세요");
	}

	// 이메일
	public void sendEmail(String toemail, int type, String contents) {

		// 1. API 다운로드 [ activation.jar , mail.jar ]
		// 2. 라이브러리 추가 [ javase11 => module-info ]
		// 0.설정
		String fromemail = "보내는사람이메일@naver.com";
		String frompassword = "패스워드";
		// 설정관련 map( 키 , 값 ) 컬렉션
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.naver.com");
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.auth", true);
		// 1. 인증
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			@Override // 패스워드 인증 메소드 => 재정의
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(fromemail, frompassword);
			}
		});
		// 2. 메일보내기
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromemail)); // 무조건 예외처리 발생
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toemail));

			if (type == 1) {
				message.setSubject(" java console 커뮤니티 ");
				message.setText(" 회원님의 비밀번호 : " + contents);
			}
			Transport.send(message);
		} catch (Exception e) {
			System.out.println("[[ 메일전송 실패 ]] : 관리자에게 문의 ");
		}
	}

}
