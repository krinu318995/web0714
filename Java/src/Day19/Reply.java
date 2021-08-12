package Day19;

import java.util.Scanner;

public class Reply {

	// 필드
	private int rNumber;// 댓글 번호
	private int boardNumber;// 어떤 게시물에 달린 댓글인지 식별하기 위함
	private String writer;
	private String contents;

	public static int totalReply = 0;

	Scanner scanner = new Scanner(System.in);

	// getter. setter
	public int getrNumber() {
		return rNumber;
	}

	public void setrNumber(int rNumber) {
		this.rNumber = rNumber;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	// 생성자
	public Reply() {
		// 빈 생성자
	}

	// 모든 필드를 받는 생성자
	public Reply(int rNumber, int boardNumber, String writer, String contents) {
		super();
		this.rNumber = rNumber;
		this.boardNumber = boardNumber;
		this.writer = writer;
		this.contents = contents;
	}

	// 댓글 쓰기, 게시물 번호 받아와야 함
	// Member login 로그인한 아이디가 작성자로 들어가야함
	public void writeReply(int boardNumber, Member login) {
		System.out.println("댓글 내용");
		String contents = scanner.nextLine();

		Reply reply = new Reply(totalReply + 1, boardNumber, login.getId(), contents);
		ConsoleProgram.replyList.add(reply);
		// 파일처리
		try {
			FileUtil.filesave(4, 0);
			FileUtil.filesave(5, reply.getrNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 댓글 출력
	public void showReply(int number) {
		System.out.println("댓글");
		for (Reply reply : ConsoleProgram.replyList) {
			if (reply.getBoardNumber() == number) {
				System.out.println(reply.contents + "\t 작성자" + reply.writer);
			}
		}

	}

	// 댓글 삭제
	public void removeReply() {

	}

	// 댓글 수정
	public void updateReply() {

	}

}
