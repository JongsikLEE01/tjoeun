package Day09.Ex01_Computer;
// 추상 클래스의 추상 메소드를 구현하지 않으면
// 해당 클래스도 추상 클래스로 정의해야한다.
public abstract class LapTop extends Computer{

	@Override
	public void display() {
		System.out.println("Laptop display 출력 중...");
	}
}