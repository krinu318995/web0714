package Day18;

import java.util.HashMap;

public class Day18_1 {
	// Map
	// 1. HashMap : 동기화 X [단일 스레드 사용시]

	// 2. HashTable : 동기화 O [멀티 스레드 사용시]
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>(); // json과 유사함
		// 멀티 제너릭 : 객체 내 매개타입 자료형
		// k : key, v : value

		// put(키, 값) : 키와 값 -> 엔트리 [키 값은 중복 불가능]
		// get(키) : 키에 해당하는 값
		// keySet : 모든 값
		// values : 모든 값 출력
		// size : 엔트리 전체 수
		// remove(키) : 키에 해당하는 엔트리 삭제
		// clear : 모든 엔트리 삭제
		hashMap.put("도비", 1);
		hashMap.put("Dobby", 1);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap);
	}
}
