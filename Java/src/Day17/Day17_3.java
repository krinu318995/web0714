package Day17;

import java.util.HashSet;
import java.util.Iterator;

public class Day17_3 {

	// List : 저장 순서가 존재, 중복값 허용

	// Set collection : 저장 순서 없음, 중복값 불가능
	// -HashSet : 중복 안됨
	// -TreeSet :

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("hash");
		hashSet.add("python");
		hashSet.add("c++");
		hashSet.add("java");
		hashSet.add("java");

		System.out.println("hashSet : " + hashSet);
		System.out.println("hashSet size : "+hashSet.size());
		System.out.println("hashSet remove(\"java\")");	
		hashSet.remove("java");
		System.out.println("hashSet : " + hashSet);
		
		
		System.out.println("================================================");
		//호출
		// 반복문 vs 순회
		for(String str : hashSet) {
			System.out.println(str);
		}
		
		// Itertator 인터페이스
		// .next() : 
		// .hasNext() : 다음 요소가 있는지 확인
		
		
		Iterator<String> iterator = hashSet.iterator();
		//iterator
		while(iterator.hasNext()) {
			System.out.println("객체 : "+iterator.next());
			System.out.println(iterator.hasNext());
			
		}//end of while
		
		hashSet.isEmpty();
		
	}
}
