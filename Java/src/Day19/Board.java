package Day19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Board {

	private int number; // 게시물 번호
	private String title;// 제목
	private String contents;// 내용
	private String writer;// 작성자
	private String bdate; // 작성일
	private int count;// 조회수

	public static int totalNumber = 0;

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

	// 게시판 메뉴
	public void menu() {

	}

	// 모든 게시물 출력 리스트
	public void view() {

		for (Board board : ConsoleProgram.boardList) {
			System.out.println(
					board.number + "\t" + board.title + "\t" + board.writer + "\t" + board.count + "\t" + board.bdate);
		}
	}

	public Board(int number, String title, String contents, String writer, String bdate, int count) {
		super();
		this.number = number;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.bdate = bdate;
		this.count = count;
	}

	public void detail(Member loginUser) {

		System.out.println("게시물 번호");
		int number = scanner.nextInt();
		for (Board board : ConsoleProgram.boardList) {
			board.count++;
			if (board.number == number) {
				System.out.println("제목\t" + board.title + "\t작성일\t" + board.bdate + "\t조회수" + board.count);
				System.out.println("작성자\t" + board.writer);
				System.out.println("내용\t" + board.contents);
				System.out.println();
				Reply reply = new Reply();
				reply.showReply(number);
				System.out.println("0 댓글 작성");
				int temp = scanner.nextInt();

				if (temp == 0) {

					reply.writeReply(number, loginUser);
				}

				if (board.writer.equals(loginUser.getId())) {
					// 게시물작성자 와 로그인된정보의 아이디가 동일하면
					System.out.println("1.수정 2.삭제");
					if (temp == 1) {
						System.out.println(" [[해당 게시물 수정]] ");
						scanner.nextLine(); // 문제점 : 앞전에 next()등 이 있을경우
						System.out.print("[[ 제목 : ");
						board.title = scanner.nextLine();
						System.out.print("[[ 내용 : ");
						board.contents = scanner.nextLine();
						// 파일처리 ( 업데이트 )
						try {
							FileUtil.filesave(2, 0);
						} catch (Exception e) {
						}

						System.out.println(" [[ 수정 되었습니다 ]]");
					}
					if (temp == 2) {
						System.out.println(" [[해당 게시물 삭제]] ");
						ConsoleProgram.boardList.remove(board); // 현재 게시물를 리스트에 삭제
						// 파일처리 ( 업데이트 )
						try {
							FileUtil.filesave(2, 0);
						} catch (Exception e) {
						}
						System.out.println(" [[ 삭제 되었습니다 ]]");
						return; // 메소드 종료
					}
				}
			}
		}

	}

	// 작성
	public void boardwrite(Member login) {

		// scanner.nextLine(); 문제점
		// scanner.nextLine(); // 문제점 보완
		System.out.print("[[ 제목 : ");
		String title = scanner.nextLine();
		System.out.print("[[ 내용 : ");
		String contents = scanner.nextLine();
		String writer = login.getId(); // 로그인된 아이디

		// 1. 현재날짜/시간 클래스
		Date date = new Date();
		// 2.형식 변환 클래스
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm");
		String bdate = simpleDateFormat.format(date);

//		private int number; // 게시물 번호
//		private String title;// 제목
//		private String contents;// 내용
//		private String writer;// 작성자
//		private String bdate; // 작성일
//		private int count;// 조회수

		// 객체
		try {
			FileUtil.fileload(3);
		} catch (Exception e) {
		}

		Board board = new Board(totalNumber + 1, title, contents, writer, bdate, 0);
		ConsoleProgram.boardList.add(board);
		// 파일처리
		try {
			FileUtil.filesave(3, board.getNumber());
			FileUtil.filesave(2, 0);
		} catch (Exception e) {
		}
		System.out.println("[[ 게시물 등록 완료 ]] ");
	}

	// 수정
	public void update() {

	}

	// 삭제
	public void delete() {

	}

}
