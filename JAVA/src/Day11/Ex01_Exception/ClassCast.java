package Day11.Ex01_Exception;
// 예외처리 - ClassCastException -> 클래스간의 타입 변환 시 올바르지 않은 변환으로 발생하는 예외
// ex) 업캐스팅이 전제되지 않은 다운 캐스팅, (부모/자식 관계가 아닌 클래스로 캐스팅하는 행위)
class Animal{ }
class Dog extends Animal{ }
class Cat extends Animal{ }
public class ClassCast {
	// 부모클래스 - Animal,	자식클래스 - Dog, Cat
	// Animal = Cat		업캐스팅 이후에
	// Animal = Dog		처럼 다운캐스팅 할 수 없음
	// 즉 Cat를 Dog로 변환할 수 없음
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeToDog(dog);		// O
		
		Cat cat = new Cat();
		changeToDog(cat);		// X
	}
	
	public static void changeToDog(Animal animal) {		// 매개변수로 받는 과정에서 업캐스팅
		// 예외 메세지 : java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;						// 다운캐스팅
		} catch (Exception e) {
			System.err.println("Cat를 Dog로 변환할 수 없습니다.");
		}
	}
}