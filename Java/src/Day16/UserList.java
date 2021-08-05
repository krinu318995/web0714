package Day16;

import java.util.Scanner;

public class UserList<T> {
	// generic : 외부로부터 들어오는 자료형 타입
	/*
	 * 명단 추가 명단 출력
	 * 
	 * 조건 : 이름, 나이 입력받아 아래 조건에 따라 명단 등록
		조건 : 나이 8세 미만 유아 -> 유아 명단 
		나이 20세 미만 청소년 -> 청소년 명단 
		그 외의 연령 -> 성인 명단에 추가 조건 : 명단별 이름들의 모든 이름 출력
	 */

	private String listName;
	private T[] userList;

	public UserList(String listName) {
		this.listName = listName;
		this.userList = (T[]) new Object[10];
		// T로는 메모리 받을 수 없음, object로 메모리 할당 받고 자료형 변환
	}

	public void add(T t) {
		for (int i = 0; i < userList.length; i++) {
			if (userList[i] == null) {
				userList[i] = t;
				return;

			}
		}

		System.out.println("명단이 꽉 찼습니다.");
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public T[] getUserList() {
		return userList;
	}

	public void setUserList(T[] userList) {
		this.userList = userList;
	}

}
