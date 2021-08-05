package Day16;

public class Course<ParameterClass> {

	private String courseName;
	private ParameterClass[] userList;

	public Course(String courseName, int number) {
		super();
		this.courseName = courseName;
		this.userList = (ParameterClass[]) new Object[number];
		// this : 현재 클래스 멤버

	}

	public void add(ParameterClass parameter) {
		for (int i = 0; i < userList.length; i++) {
			if (userList[i] == null) {
				userList[i] = parameter;
				break;
			}
		}

	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ParameterClass[] getUserList() {
		return userList;
	}

	public void setUserList(ParameterClass[] userList) {
		this.userList = userList;
	}

}
