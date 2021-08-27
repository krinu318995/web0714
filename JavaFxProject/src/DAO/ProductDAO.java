package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProductDAO {
	// DB 접근 객체
	// dao -> dto
	Connection connection;// db연결 인터페이스 : 메모리가 할당되지 않음
	// 각 회사의 sql과 연결하기 위해 사용
	// interface 는 new를 사용하면 모든 추상메서드에 대해 정의해야 함
	ResultSet resultSet;

	private static ProductDAO productDAO = new ProductDAO();
	// 미리 인스턴스를 만듦
	// 메모리를 효율적으로 사용하기 위함

	public static ProductDAO getProductDao() {
		return productDAO;
	}

	public ProductDAO() {
		// DB접근 생성자

		// 클래스와 인터페이스[추상메서드] 인지
		// 1. driver call

		// 2. db의 url 연결
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC", "root",
					"1234");
			// database url, user, password
			// 메모리 할당
			System.out.println("product DB 연결 완료");
		} catch (Exception e) {
			// db라이브러리에 문제가 생길경우
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("해당 드라이버가 존재하지 않습니다.");
		}

		// TODO Auto-generated constructor stub
	}
}
