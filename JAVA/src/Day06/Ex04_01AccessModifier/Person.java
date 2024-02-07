package Day06.Ex04_01AccessModifier;

public class Person {
	// 이름 나이 키 체중
	public String name;
	protected int age;
	int height;
	private int weigth;
	
	//생성자
	public Person() {
		
	}
	// 매개변수 생성자
	public Person(String name, int age, int height, int weigth) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weigth = weigth;
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weigth=" + weigth + "]";
	}
}
