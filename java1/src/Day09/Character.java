package Day09;

public class Character {

	// 필드
	public String name;// 캐릭터 이름
	protected int level;// 캐릭터 레벨
	int exp;// 경험치
	private int power;// 공격력
	
	final String code = "10" ;
	
	// 생성자
	public Character() {
		// TODO Auto-generated constructor stub
	}
	// 메서드

	// private 객체 접근 메서드 getter, setter
	// private 객체 값 갖고옴
	public int getPower() {
		return power;
	}

	// private 객체 값 설정
	public void setPower(int power) {
		this.power = power;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getExp() {
		return exp;
	}

	public void showInfo() {
		System.out.println("이름\t" + name);
		System.out.println("Lv\t" + getLevel());
		System.out.println("exp\t" + getExp());
		System.out.println("power\t" + getPower());
	}

}
