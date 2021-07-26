package Day08;

import java.util.Date;
import java.util.Scanner;

public class Board {

	int number;
	String title;
	String content;
	String writer;
	String date;
	int views;

	// 생성자명==클래스명

	// 빈 생성자
	public Board() {
	}

	// 모든 필드
	public Board(int number, String title, String content, String writer, String date, int veiws) {
		this.number = number;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.views = veiws;

	}

	// 작성
	public void write() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("글쓰기 페이지");
		System.out.println("제목");
		String title = scanner.nextLine();
		System.out.println("작성자");
		String writer = scanner.nextLine();
		System.out.println("내용");
		String content = scanner.nextLine();
		System.out.println();

		// 1. 객체 생성
		int number = 1;

		Date date = new Date();
		String boardDate = date.toString();

		for (int i = 0; i < Day08_start.boardList.length; i++) {
			if (Day08_start.boardList[i] == null) {
				// 첫번째 게시물인 경우 1부터 시작
				if (i == 0) {
					number = 1;
					break;
				}
				// 첫번쨰 게시물이 아닌 경우 마지막 게시물의 +1
				else {
					number = Day08_start.boardList[i-1].number + 1;
					break;
				}
			}
		}
		int views = 1;

		Board board = new Board(number, title, content, writer, content, views);
		for (int i = 0; i < Day08_start.boardList.length; i++) {
			if (Day08_start.boardList[i] == null) {
				Day08_start.boardList[i] = board;
				break;
			}
		}
		Day08_start.boardList[0] = board;
		// 2. 다수의 객체를 저장하는 메모리 (주 기억 장치) [배열, 리스트 ...]

		// 3. 프로그램 종료시 저장되는 메모리(보조 기억 장치) [파일 처리, database]
	}

	// 목록
	public void boardList() {
		System.out.println("[[[[커뮤니티]]]]");
		if (Day08_start.boardList[0] == null) {
			return;
		}
		System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
		System.out.print(Day08_start.boardList[0].number + "\t");
		System.out.print(Day08_start.boardList[0].title + "\t\t");
		System.out.print(Day08_start.boardList[0].writer + "");
		System.out.print(Day08_start.boardList[0].views + "\t");
		System.out.print(Day08_start.boardList[0].date);

	}

	// 수정
	public void boardUpdate() {
		System.out.println("수정");
	}

	// 삭제
	public void boardDelete() {
		System.out.println("삭제");

	}

	// 조회수 증가
	public void boardCount() {
		System.out.println("조회수 증가");
	}

	// 상세페이지
	public void boradDetail(int ch2) {
		System.out.println("상세페이지");

	}
}
