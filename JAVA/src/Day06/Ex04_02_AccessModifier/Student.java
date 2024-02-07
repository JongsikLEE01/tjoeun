package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01AccessModifier.Person;

public class Student extends Person{
	//생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weigth) {
		super(name, age, height, weigth);
	}
	
	//메소드
	public void defaultSetting() {
		name = "이름없음"; // public 접근지정자, 모든 곳에서 접근 가능
		age = 20;         // protected 접근지정자, Person을 상속 받아 다른 패키지여도 접근 가능
		// height = 150;  // difault 접근지정자, 같은 패키지에서만 접근 가능
		// weigth = 40;   // private 접근지정자, 같은 클래스에서만 접근 가능
		setHeight(150);
		setWeigth(40);    // difault, private 접근지정자, set메소드를 이용해 public로 접근
	}
}
