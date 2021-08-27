package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Domain.BoardDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDAO {

	// connection
	Connection connection;

	ResultSet resultSet;// sql 결과 연결

	// 현재 클래스의 객체
	private static BoardDAO boardDAO = new BoardDAO();// DB와 연결할 객체

	public static BoardDAO getBoardDAO() {
		return boardDAO;
	}

	public BoardDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx_2?serverTime=UTC", "root",
					"1234");
			System.out.println("DB연동");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 글쓰기 메서드 [인수 BoardDTO (화면으로 입력받은 값을 컨트롤해서 dao로 넘김]
	public boolean boardwrite(BoardDTO board) {
		// sql 작성 => sql <===================db 연결 => sql 조작 => sql실행 => sql종료

		String sql = "insert into board (btitle, bcontent, bwriter) values (?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getBtitle());
			preparedStatement.setString(2, board.getBcontent());
			preparedStatement.setString(3, board.getBwriter());

			preparedStatement.executeUpdate(); // sql insert, update, delete

			return true;
			//
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;

	}

	// 글 목록
	public ObservableList<BoardDTO> boardList() {
		ObservableList<BoardDTO> boardDtos = FXCollections.observableArrayList();

		String sql = "select * from board";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// 결과
			resultSet = preparedStatement.executeQuery(); // select
			while (resultSet.next()) {
				// resultSet.next() : 다음 레코드
				// 1. Dto만듦 -> list 저장 -> list 반환
				// dto : 변수가 n개인 경우 편의를 위해 사용함
				BoardDTO boardDTO = new BoardDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));

				boardDtos.add(boardDTO);
			}

			return boardDtos;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
//ObservableList : tableView는 ObservableList가 반드시 필요하
	}

	public boolean boardDelete(int bno) {

		String sql = "delete from board where bno = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bno);
			preparedStatement.executeLargeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public boolean boardUpdate(String title, String contents, int bno) {
		String sql = "update board set btitle = ?, bcontent=? where bno =?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, title);
			preparedStatement.setString(2, contents);
			preparedStatement.setInt(3, bno);
			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public boolean baordCount(int bcount, int bno) {
		String sql = "update board set bcount = ? where bno = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, bcount);
			preparedStatement.setInt(2, bno);
			preparedStatement.executeUpdate();

			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
