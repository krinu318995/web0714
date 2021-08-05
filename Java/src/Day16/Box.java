package Day16;

public class Box {
	// 다양한 객체를 담는 클래스
	// object가 최상위 객체이기 때문에 오든 자료형을 받을 수 있음
	private Object object;
	// 임시 객체

	// getter
	public Object getObject() {
		return object;
	}

	// setter
	public void setObject(Object object) {
		this.object = object;
	}

}
