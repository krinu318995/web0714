package Day15;

import java.util.Scanner;

public class Day15_Sync_2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean start = true;

		while (true) {
			// while(논리) : 논리가 true 무한루프 실행
			System.out.println("1.음악 2.영화");
			int menu = scanner.nextInt();

			if (menu == 1) {

				Thread threadMusic = new Music();

				threadMusic.run();
				if (start) {
					Music.musicStop(start);
					threadMusic.start();

					// threadMusic.stop();....메모리 손실이 있음
					start = false;
					// 스위치 변수를 이용한 종료 [안전하게 종료]
				}else {
					Music.musicStop(start);
					start = true;
				}

			}
			if (menu == 2) {

				Thread threadMovie = new Movie();

				threadMovie.run();
				if (start) {
					Movie.movieStop(start);
					start = false;
				}

			}

		}
	}
}
