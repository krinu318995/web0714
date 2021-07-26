package Day08;

import java.util.Scanner;

public class Day08_start {
	// 모든 메서드에서 사용하기 위해 전역변수로 지정

	// 전역변수 : main 메서드 밖에서
	// 지역변수 : main 메서드 안에 선언

	public static Scanner scanner = new Scanner(System.in);

	//배열
	public static Board [] boardList = new Board[100];
	
	
	public static void main(String[] args) {
		start();
	}// end of main

	public static void start() {

		Board board = new Board();
		while (true) {
			board.boardList();
			System.out.println("0. 글쓰기 1. 글 상세보기");
			int ch = scanner.nextInt();
			if (ch == 0) {
				board.write();
			}
			if (ch == 1) {
				System.out.println("게시물 번호 ->");
				int ch2 = scanner.nextInt();
				board.boradDetail(ch2);
			}
		}
	}// end of method

}// end of class
