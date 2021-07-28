package Day10;

public class Day10_2 {

	public static void main(String[] args) {

		Member member = new Member("dobby", "isNormal");

		Vip vip = new Vip("Dobby", "isFree", "VIP");

		Admin admin = new Admin("admin", "admin", "admin");

		Member[] members = new Member[3];

		members[0] = member;
		members[1] = vip;
		members[2] = admin;

		// 슈퍼클래스로 선언된 배열에는 서브클래스 저장 가능

		// 반면 서브 클래스로 선언된 배열에는 슈퍼 클래스 저장 불가능함

		Vip[] vips = new Vip[2];
		// vips[0] = member;
		vips[1] = vip;
		
		for(int i = 0; i<members.length; i++) {
			members[i].showUserInfo();
		}
	}
}
