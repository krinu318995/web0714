package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.Member;

public class MemberDAO {

	// DataBase연결

	// DAO (Data Access Object)

	// DB 주요 인터페이스
	// 1.Connection : DB 연결 인터페이스 선언
	// 2. PrepareStatement : DB 연결 후 SQL관리/ 조작
	// 3. ResultSet : query와 연결

	// Connection
	private Connection conn;// DB연결 인터페이스

	private static MemberDAO memberDAO = new MemberDAO();
	// 현재 클래스 객체

	private ResultSet resultSet;// 검색 후 결과 [쿼리] 연결

	public static MemberDAO getMemberDao() {
		return memberDAO;
	}

	public MemberDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC", "root", "1234");
			System.out.println("DB 연동 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} // DB 연결
	}

	// 1. 회원가입
	public boolean signUp(Member member) {

//		create table javafx_2.member (
//				m_id varchar(100) primary key,
//				m_password varchar(100) not null,
//				m_name varchar(10) not null,
//				m_email varchar(100) not null,
//				m_phone varchar(100) not null, 
//				m_point int not null
//				);

		// 1. 회원가입 sql 작성
		String sql = "insert into member (m_id, m_password, m_name, m_email, m_phone, m_point) values (?, ?, ?, ?, ?, ?)";
		// ? : 매개변수
		// insert into 테이블명 (필드1 , 필드 2, .....) values (값 1, 값2, ......)
		// 모든 필드에 다 삽입할 경우 필드명 생략 가능함
		// insert into 테이블명 values (?, ?, ?, ......)

		// 2. DB 연결

		// Statement : sql 구문을 실행, 관리
		// PreparedStatement : sql 관리

		// 3. sql 조작
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, member.getId());
			preparedStatement.setString(2, member.getPassword());
			preparedStatement.setString(3, member.getName());
			preparedStatement.setString(4, member.getEmail());
			preparedStatement.setString(5, member.getPhoneNumber());
			preparedStatement.setInt(6, member.getPoint());

			// 4. sql 실행
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("db 문제 생김");
			e.getMessage();
			e.printStackTrace();
		}

		// 5. sql 결과
		return false;// 회원가입 실패시 false 반환
	}

	// 2. 로그인
	public boolean signIn(String id, String password) {

		String sql = "select * from member where m_id = ? and m_password = ?";
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				// resultSet의 초기값 ==null -> 결과 1 레코드 -> 결과 2 레코드
				// sql 결과가 존재하면
				return true;
			}
			
			return false;// 로그인 실패 or DB오류
			
		} catch (SQLException e) {
			System.out.println("db 오류");
			e.printStackTrace();
			e.getMessage();
		}

		return false;// 로그인 실패 or DB오류
	}
	// 3. 아이디 찾기

	// 4. 비밀번호 찾기

	// 5. 회원정보 수정

	// 6. 회원 탈퇴

}
