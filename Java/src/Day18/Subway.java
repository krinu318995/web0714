package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Subway {

	public static Queue<SubwayCode> terminal = new LinkedList<>();
	public static Queue<SubwayCode> yongsan = new LinkedList<>();
	public static Queue<SubwayCode> seoul = new LinkedList<>();
	public static Queue<SubwayCode> guro = new LinkedList<>();
	static ArrayList<Queue<SubwayCode>> now = new ArrayList<Queue<SubwayCode>>();
	// main안에 선언하면 static 메서드에서 사용할 수 없어서 main 밖에 전역변수로 선언함
	// 모든 메서드에서 사용하기 위해

	public static void main(String[] args) {

		terminal.offer(new SubwayCode("c-1"));
		terminal.offer(new SubwayCode("c-2"));
		terminal.offer(new SubwayCode("c-3"));

		now.add(terminal);
		now.add(yongsan);
		now.add(seoul);
		now.add(guro);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("출발신호 | 1. 종점 2. 용산 3. 서울 4. 구로");

			int ch = scanner.nextInt();
			if (ch == 0) {
				sign(ch);
			}
			if (ch == 1) {
				sign(ch);
			}
			if (ch == 2) {

			}
			if (ch == 3) {

			}
		}

	}// end of main

	// 전철 출발 신호 [메서드화 : ]
	public static void sign(int stationCode) {

		if (now.get(stationCode).isEmpty()) {
			System.out.println("현재 대기중인 열차가 없습니다.");
			return;
		}

		// 해당 역에서 전철 빼기
		SubwayCode temp = now.get(stationCode).poll();
		System.out.println("출발=" + temp.subwayNumber);
		System.out.println("소요시간2초");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (stationCode + 1 >= now.size()) {
			now.get(0).offer(temp);
		}
		else {
		now.get(stationCode + 1).offer(temp);
		System.out.println("도착 = " + temp.subwayNumber);
		}
	}

	public static void status() {
		System.out.println();
	}

}

class SubwayCode {
	String subwayNumber;

	public SubwayCode(String subwayNumber) {
		this.subwayNumber = subwayNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
// 지하철코드 클래스
