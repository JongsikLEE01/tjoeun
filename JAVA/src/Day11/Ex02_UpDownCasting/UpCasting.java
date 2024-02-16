package Day11.Ex02_UpDownCasting;

public class UpCasting {
	public static void main(String[] args) {
		// * 업캐스팅? (자동 타입 변환)
		// (부모클래스) = (자식 클래스)
		Person person = new Student("김조은", 20,1,"정보통신공학");
		
		// Person 	: name , age
		// Student	: name, age, grade, major
		System.out.println("name : "+person.name);
		System.out.println("name : "+person.age);
		
		// Person 객체에서는 grade, major 변수를 접근할 수 없음
		// System.out.println("grade : "+person.grade);
		// System.out.println("major : "+person.major);
		
		// 클래스를 업캐스팅 하면, 변수는 부모 클래스에 있는 변수만 접근 가능하고
		// 메소드는 자식 클래스의 메소드를 우선하여 실행
		System.out.println(person);
		System.out.println(person.work());
		
		// 바인딩(Biding) : 프로그램에서 사용되는 요소에 실제 값을 결정 짓는 행위
		// * 정적 바인딩 : 컴파일 시간에 결정 (변수 등)
		// * 동적 바인딩 : 실행 시간에 결정 (오버라디잉 등)
	}
}