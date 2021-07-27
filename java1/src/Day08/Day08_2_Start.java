package Day08;

import java.util.Scanner;

public class Day08_2_Start {
	
	// main 밖에 선언하는 이유 : 모든 메소드에서 사용하기위해 [ 전역변수 ] 
		// main 메소드 안에서 선언시 main에서만 사용가능 [ 지역변수 ] 
		
	public static Scanner scanner = new Scanner(System.in);
		// static : 메모리 우선할당 [ 프로그램 시작과 동시에 메모리 할당 => 모든 프로그램 종료시 초기화 ] 
	
	public static Board[] boardlist = new Board[100];
	
	public static void main(String[] args) {
		
		// 2. 메소드 호출 
		start(); // main메소드가 start 메소드를 못읽음 [ static ] 
		
		
	} // main end 
	
	
	// 1. 메소드 선언 
	// 프로그램 실행 메소드 
	public static void start() {//재활용을 위해 메서드로 만듦
		
		Board board = new Board(); // 필드가 null 인 깡통 객체 
			// 깡통객체 : 메소드 호출용

		while(true) {
			
			board.blist(); // 1. 글 목록 
			
			System.out.println("0.글쓰기 1.글상세보기 ");
			int ch = scanner.nextInt();
			
			if( ch == 0 ) board.bwrite(); // 2.글쓰기 
			if( ch == 1 ) {
				System.out.println("[[[ 게시물번호 입력 : ]]]"); 
				int bno =scanner.nextInt();
				board.bview( bno ); // 3.글 상세페이지
			}
			
			
		}
		
	}

} //class end 