package Day09_1;

import Day09.Character;

public class Day09_1_1 {
	public static void main(String[] args) {
		// 서로 다른 패키지
		Character character = new Character();
		character.name = "DOBBY";
		character.setLevel(100);
		character.showInfo();
	}
}
