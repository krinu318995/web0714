package Day10;

public class Member {

	private String id;
	private String password;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void showUserInfo() {
		System.out.println("아이디\t" + getId());
		System.out.println("비밀번호\t" + getPassword());
	}

}
