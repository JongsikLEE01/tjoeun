package Day14.Ex02_WildCard;

public class WildCardEx {
	// <?> : 알수없는 타입을 대체하기 위해서 사용하는 기호
	// 일반 과정
	public static void checkCourse(Course<?> course) {
		System.out.println("과정명 : "+course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student + " ");
		}
		System.out.println();
	}
	// 직장인 과정
	// super? : 트리 진행을 역순으로 상위 클래스로 제한(해당 클래스부터 상위 클래스를 허용하도록 제한)
	public static void checkWorkerCourse(Course<? super Worker> course) {
		System.out.println("과정명 : "+course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student + " ");
		}
		System.out.println();
	}
	// 학생 과정
	// extends? : 트리구조 중 진행을 하위 클래스로 제한(해당 클래스부터 하위 클래스를 허용하도록 제한)
	public static void checkStudentCourse(Course<? extends Student> course) {
		System.out.println("과정명 : "+course.getName());
		Object[] studentList = course.getStudents();
		for (Object student : studentList) {
			System.out.println(student + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//  일반과정, 정원5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new MiddleStudent("중학생"));
		
		checkCourse(personCourse);
		
		// 직장과정, 정원5
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		// workerCourse.add(new Person("일반인"));
		workerCourse.add(new Worker("직장인"));
		// workerCourse.add(new Student("학생"));
		// workerCourse.add(new HighStudent("고등학생"));
		// workerCourse.add(new MiddleStudent("중학생"));
		checkWorkerCourse(workerCourse);
		
		checkCourse(workerCourse);
		// 직장인과정은 일반과정 안에 포함되는 과정이므로 checkCourse메소드로 직장인 과정을 호출할 수 있음
		
		checkWorkerCourse(personCourse);
		// <? super Worker>으로 메소드를 제한해두어 상위클래스를 조회할 수 있어 출력 가능
		
		// 학생과정, 정원5명
		Course<Student> stuendCourse = new Course<>("학생과정", 5);
		// stuendCourse.add(new Person("일반인"));
		// stuendCourse.add(new Worker("직장인"));
		stuendCourse.add(new Student("학생"));
		stuendCourse.add(new HighStudent("고등학생"));
		stuendCourse.add(new MiddleStudent("중학생"));
		
		// 중학생과정
		Course<MiddleStudent> MiddleStudendCourse = new Course<MiddleStudent>("중학생과정", 5);
		
		// 고등학생과정
		Course<HighStudent> HighStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		
		checkStudentCourse(stuendCourse);
		checkStudentCourse(MiddleStudendCourse);
		checkStudentCourse(HighStudentCourse);
		
	}
}