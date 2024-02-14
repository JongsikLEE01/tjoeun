package Day08.Ex02_Shape;

public class Circle extends Shape{
	// 변수 선언
	double radius;
	
	// 생성자 정의
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
	}
	
	// 메소드 정의
	@Override
	double area() {
		// 원주율 * 반지름 * 반지름
		return Math.PI * radius * radius;
	}
	@Override
	double round() {
		// 2* 원주율 * 반지름
		return 2 * Math.PI * radius;
	}
	
	// getter, setter 정의
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// tostring 재정의
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}