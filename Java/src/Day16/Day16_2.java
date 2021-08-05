package Day16;

import java.util.Arrays;

public class Day16_2 {
	public static void main(String[] args) {
		// generic
		// 자체적으로 new 연산자 불가능

		// 1. generic을 이용한 객체 생성
		Course<Human> humanCourse = new Course<>("일반인 과정", 5);

		humanCourse.add(new Human("도비"));
		humanCourse.add(new Workers("DOBBY"));

		Course<Workers> forWorkers = new Course<>("직장인 과정", 5);
		// forWorkers.add(new Human("dobby")); 안됨
		forWorkers.add(new Workers("도비"));
		// forWorkers.add(new Student("학생도비")); 안됨
		// forWorkers.add(new HighSchool("고등학생 도비"));안됨

		Course<Student> forStudent = new Course<>("학생 과정", 5);
		// forStudent.add(new Human("사람"));//student의 상위클래스, add불가능
		// forStudent.add(new Workers("직장인"));
		forStudent.add(new Student("학생"));
		forStudent.add(new HighSchool("도비"));// student의 서브클래스

		Course<HighSchool> forHighschool = new Course<HighSchool>("고등학생 과정", 5);

		// forHighschool.add(new Human("사람")); 안됨
		// forHighschool.add(new Workers("직장인")); 안됨
		// forHighschool.add(new Student("학생")); 안됨
		forHighschool.add(new HighSchool("고등학생"));

		showStudentsList(humanCourse);
		showStudentsList(forHighschool);
		showStudentsList(forStudent);
		showStudentsList(forWorkers);

		// printStudentList(forWorkers); 이거 안됨
		// printStudentList(humanCourse); 이거 안됨
		printStudentList(forHighschool);
		printStudentList(forStudent);
		
		//Student, HighSchool 안됨
		printWorkersList(humanCourse);
		printWorkersList(forWorkers);

	}// end of main

	public static void showStudentsList(Course<?> course) {
		// ---------------------------------->?(와일드카드): 인수로 들어오는 generic <이 안에 들어가는 놈>

		// static 정적 할당, 프로그램 실행시 메모리 할당, 프로그램 실행시 메모리 초기화
		// static으로 설정하지 않으면 main메서드에서 사용할 수 없음
		// ? : 와일드카드
		System.out.println(course.getCourseName() + "수강생 명단\t\t|" + Arrays.toString(course.getUserList()));
		// Arrays : 배열에 관련된 메서드 제공
		// Arrays.toString(배열) : 배열내 전체 요소들의 정보 출력
		// 객체의 정보 - 주소값

	}

	// 학생 목록 메서드
	public static void printStudentList(Course<? extends Student> course) {
		// Student 클래스로부터 상속받은 클래스들만 가능함
		System.out.println(course.getCourseName() + " 수강생 명단");

		System.out.println(Arrays.toString(course.getUserList()));
	}

	// 직장인 목록 출력 메서드
	public static void printWorkersList(Course<? super Workers> course) {
		// super Workers : 직장인 클래스 또는 직장인에게 상속해준 모든 클래스
		System.out.println(course.getCourseName() + " 수강생 명단");

		System.out.println(Arrays.toString(course.getUserList()));
	}

}
