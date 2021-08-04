
package Day15;

public class Day15_2 {

	// 스레드의 우선순위
	// 여러 개의 스레드는 os로부터 스케줄링 랜덤으로 할당받음
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new CheckThread("스레드 번호" + i);
			//우선순위
			if(i!=9) {
				thread.setPriority(thread.MIN_PRIORITY);
				//9번 아니면 우선순위 낮음
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
				//가장 높은 우선순위 할당
			}
			
			thread.start();
		}
	}

}
