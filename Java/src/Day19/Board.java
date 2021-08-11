package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {

	public static int number = 0; // 게시물 번호
	private String title;// 제목
	private String contents;// 내용
	private String writer;// 작성자
	private String bdate; // 작성일
	private int count;// 조회수

	Scanner scanner = new Scanner(System.in);

	// getter, setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int number, String writer, String title, String contents, String bdate, int count) {
		super();
		this.number = number;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.bdate = bdate;
		this.count = count;
	}

	// 게시판 메뉴
	public void menu() {

	}

	// 리스트
	public void list(Member loginUser) {
		while (true) {
			System.out.println("1.게시물 등록 2.게시물 조회 3.회원 정보 4.로그아웃");
			int ch = scanner.nextInt();

			if (ch == 1) {
				write(loginUser);
				// 현재 로그인된 회원 정보
			}
			if (ch == 2) {

			}
			if (ch == 3) {

			}
			if (ch == 4) {
				System.out.println("로그아웃 되었습니다.");
				return;
			}

		}
	}

	public void detail() {

	}

	// 작성
	public void write(Member loginUser) {
		System.out.println("제목");
		scanner.nextLine();// 문제점 희생양
		String title = scanner.nextLine();
		System.out.println("내용");
		String contents = scanner.nextLine();

		// 작성자
		String writer = loginUser.getId();
		// 작성일
		Date date = new Date();
		// 형식 변환 클래스
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh:mm");
		String bdate = dateFormat.format(date);
		try {
			FileUtil.loadFile(3);
		} catch (Exception e1) {

			Board board = new Board(number + 1, writer, title, contents, bdate, 0);
			ConsoleProgram.boardList.add(board);
		}

		try {
			FileUtil.fileSave(2, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 수정
	public void update() {

	}

	// 삭제
	public void delete() {

	}

}
