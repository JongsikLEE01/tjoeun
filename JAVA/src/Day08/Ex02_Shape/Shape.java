package Day08.Ex02_Shape;
// 추상클래스
public abstract class Shape {
	// point 멤버 변수 선언
	Point point;
	
	// 넓이(area)와 둘레(round)를 구하는 메소드 원형을 정의
	// 키워드 : abstract
	// 추상 메소드 : abstract 반환타입 메소드명(매개변수);
	abstract double area(); // 넓이를 구하는 추상 메소드
	abstract double round(); // 둘레를 구하는 추상 메소드
	
	// getter, setter 메소드를 정의
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}	
}
