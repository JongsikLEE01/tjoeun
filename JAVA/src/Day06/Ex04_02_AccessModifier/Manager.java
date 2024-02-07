package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01AccessModifier.Person;

public class Manager {
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : "+student.name);
		// System.out.println("age : "+student.age); // protected 접근지정자, Person을 상속 받아 다른 패키지여도 접근 가능
		System.out.println("age : "+student.getAge());
		// Manager에서 Strudent의 default 접근자 변수인 height를 접근 할 수 없는 이유?
		// 같은 패키지에 있지만 실질적으로 height를 선언한 곳은 다른 패키지인 Person에서 선언을 했기 때문에 접근불가
		// 선언한 클래스를 기준으로 접근지정자가 적용된다.
		System.out.println("height : "+ student.getHeight());
		System.out.println("weigth : " + student.getWeigth());
		System.out.println();
		
		Person person = new Person("김조은",20,170,60);
		System.out.println("name : "+person.name);
		System.out.println("age : "+person.getAge());
		System.out.println("height : "+ person.getHeight());
		System.out.println("weigth : " + person.getWeigth());
		System.out.println();
	}
}