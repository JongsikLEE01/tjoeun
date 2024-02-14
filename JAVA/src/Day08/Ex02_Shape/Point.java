package Day08.Ex02_Shape;

public class Point {
	// 멤버 변수 선언
	int x, y;

	// alt + shift + S -> C : 생성자
	// 매개 변수 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 기본 생성자
	Point() {
	}

	// alt + shift + S -> S : toString 재정의
	//toString() 메소드 재정의
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}