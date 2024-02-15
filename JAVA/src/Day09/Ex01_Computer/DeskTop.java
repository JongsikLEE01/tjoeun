package Day09.Ex01_Computer;
// 부모 클래스의 추상 메소드는 반드시 오버라이딩 해야함
public class DeskTop extends Computer{
	
	@Override
	public void display() {
		System.out.println("DeskTop display 출력 중...");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing 출력 중...");
	}
}