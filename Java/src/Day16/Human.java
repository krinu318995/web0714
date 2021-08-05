package Day16;

public class Human {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	//Object 클래스 내 메서드 재정의
	@Override
	public String toString() {
		return this.name;
	}

}
