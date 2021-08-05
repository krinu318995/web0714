package Day16;

public class Day16_Generic {
	// Generic : 재사용성을 목적으로 사용, 하나의 값이 여러 데이터 타입을 가질 수 있는 변수
	// 자료형 / 클래스 => 매개값
	// 목적 : 하나의 객체가 여러 자료형으로 변경
	// Integer 객체 ->String 객체 -> Char객체
	// 내부 클래스로 외부로부터 매개타입[자료형] 받음

	// 1.generic이 없는 경우

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setObject("사과"); // String
		// Object -> String 가능함

		String name1 = (String) box1.getObject();// 강제 형 변환
		// String -> Object 불가능함
		// 상위 클래스를 하위 클래스로 받을 수 없음

		System.out.println(name1);

		box1.setObject(new Apple());
		// object는 최상위 클래스이기 때문에 모든 형식을 다 받을 수 있음
		Apple apple = (Apple) box1.getObject();
		// 하위 클래스가 상위 클래스를 받을 수 없기 때문에 강제 형변환 함

		// 2. generic이 있는 경우
		Box2<String> box2 = new Box2<>();
		box2.setGenericObject("사과");
		String name_generic = box2.getGenericObject();
		System.out.println(name_generic);

		Box2<Integer> box3 = new Box2();
		box3.setGenericObject(50);
		System.out.println(box3.getGenericObject());

		Box2<Apple> appleBox = new Box2<>();
		appleBox.setGenericObject(new Apple());
		System.out.println(appleBox);
		Apple apple2 = appleBox.getGenericObject();
		System.out.println(apple2);

		// 3. Multi Generic

		Product<Television, String> product1 = new Product<>();
		product1.setKind(new Television());
		product1.setModel("스마트 텔레비전");

		System.out.println("제품 1 : " + product1.getModel() + ", " + product1.getKind());

		Product<Car, String> product2 = new Product<Car, String>();

		product2.setKind(new Car());
		product2.setModel("디젤자동차");

		System.out.println("제품 2 : " + product2.getKind() + ", " + product2.getModel());

	}
}
