package Day17;

import java.util.*;

public class Day17_1 {

	// 하드웨어
	// 1. 주기억장치 : [RAM] : 현재 실행중인 명령어만 기억 [휘발성]
	// 2. 보조기억장치 : [c, usb, cd 등] 파일처리, DB 처리
	// 메모리 관리 방법 [주기억장치] 관리 방법
	// 1. 변수 : [자료형] 메모리 할당, 메모리 사용 효율이 떨어짐, 메모리 크기 변경 불가능, 검색 속도 빠름
	// 2. 객체 : [CLASS] 메모리 할당
	// 3. 배열 : 변수/객체의 '동일한' 자료형의 여러개의 메모리 할당
	// 4. List, Collection [Class]

	// Framework[sw] vs Library[함수집합] vs API[sw의 interface] => 미리 만들어진 명령어들]
	// Framework

	// Collection Framework : 메모리 관리 클래스

	// List
	// 1. ArrayList
	// 2. Vector
	// 3. LinkedList

	// method
	// 1. add : ("객체명") : 객체 추가
	// add(index, 객체) : 해당 인덱스에 객체 추가
	// 2. get(index) : 해당 인덱스의 객체 가져옴
	// 3. contains(객체) : 해당 객체 유무 확인
	// 4. isEmpty() : 리스트가 비어있는지 확인
	public static void main(String[] args) {

		// 1. ArrayList
		ArrayList<String> strArray = new ArrayList<>(); // 선언
		// string 객체를 여러개 담을 수 있는 list 객체 생성, new : 메모리 할당
		strArray.add("도비");
		strArray.add("dobby");
		strArray.add("DOBBY");
		strArray.add("dobby is free");

		System.out.println(strArray.get(0));
		System.out.println("before remove data of 0 index");
		System.out.println(strArray);
		System.out.println("after remove");
		strArray.remove(0);
		System.out.println(strArray);

		System.out.println(strArray.size());

		for (int i = 0; i < strArray.size(); i++) {
			System.out.println(strArray.get(i));
		}

		for (String str : strArray) {
			// 리스트의 모든 요소들을 하나씩 임시 객체에 대응
			System.out.println(str);
		}

		System.out.println("특정 위치에 객체 추가");
		strArray.add(0, "DOBBY IS FREE");
		System.out.println(strArray);
		System.out.println(strArray.contains("DO"));
		System.out.println("strArray의 도비의 위치" + strArray.indexOf("도비"));
		System.out.println("strArray의 도비의 위치" + strArray.indexOf("dobby"));
		strArray.clear();
		System.out.println("strArray clear :" + strArray);
		System.out.println(strArray.isEmpty());

		// 2. Vector 클래스
		// 차이점 : Vector 메서드 vs ArrayList 메서듬
		// 동기화 O vs 동기화 X
		// 메서드들의 synchronized 차이

		Vector<String> vectors = new Vector<>();
		vectors.add("java");
		// 3. LinkedList
		// 삽입, 삭제 용이

		ArrayList<String> arraylist2 = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<>();

		long start;
		long end;

		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arraylist2.add(i, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println((start-end));

		start = System.nanoTime();
		
		for (int i = 0; i < 10000; i++) {
			linkedList.add(i, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println(start-end);

	}
}
