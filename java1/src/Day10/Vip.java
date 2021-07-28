package Day10;

public class Vip extends Member {
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String id, String password, String grade) {
		super(id, password);
		this.grade = grade;

	}

	@Override
	public void showUserInfo() {
		// TODO Auto-generated method stub
		super.showUserInfo();
		System.out.println("등급\t" + getGrade());
	}

}
