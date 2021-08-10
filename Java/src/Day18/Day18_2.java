package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day18_2 {
	public static void main(String[] args) {
		// 컬렉션 중첩
		// ex> List컬렉션 =>map, 순서 O

		// 컬렉션 내부에 컬렉션 가능
		ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<HashMap<String, Integer>>();
		// 제너릭은 컬렉션 기능
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<>();

		arrayList.add(map);

		map.put("도비", 80);

		arrayList.add(map2);
		map2.put("도비", 80);

		// map의 키와 map2의 메모리가 다르기 떄문에 같은 키 값을 넣는 것이 가능함
		System.out.println(arrayList);

		// Map => list컬렉션
		HashMap<String, ArrayList<String>> listHash = new HashMap<String, ArrayList<String>>();

		ArrayList<String> list = new ArrayList<>();
		listHash.put("1", list);
		listHash.keySet();
		System.out.println(listHash);

		HashSet<HashMap<String, Integer>> set = new HashSet<HashMap<String, Integer>>();
		System.out.println(set);
	}
}
