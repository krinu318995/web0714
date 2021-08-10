package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day18_3 {

	// 제품 재고 [제품명, 재고] 관리
	// 조건 1 : 의류, 가방 -> 2개의 map
	// 조건 2. map key : 제품명, value : 재고
	// 조건 3. 2개의 map을 관리하는 제고 리스트 생성
	public static void main(String[] args) {

		HashMap<String, Integer> clothing = new HashMap<String, Integer>();
		HashMap<String, Integer> bag = new HashMap<String, Integer>();
		ArrayList<HashMap<String, Integer>> productList = new ArrayList<HashMap<String, Integer>>();
		productList.add(clothing);
		productList.add(bag);

		clothing.put("wv 프로젝트", 50);
		System.out.println(productList);

		while (true) {
			System.out.println("리스트 목록 : 1. 의류, 2. 가방");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			if (ch == 1) {
				System.out.println("전체 목록 " + productList.get(ch));
				System.out.println("전체 제품명" + productList.get(ch).keySet());
			}
			if (ch == 2) {
				System.out.println(productList.get(1));
			}
		}
	}

}
