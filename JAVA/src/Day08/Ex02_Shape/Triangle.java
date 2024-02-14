package Day08.Ex02_Shape;
//Shape 클래스를 구현
public class Triangle extends Shape{
	// 멤버 변수로 가로 높이 길이를 저장할 변수를 선언
	double width, height;
	
	// 생성자 정의
	public Triangle(double width, double height) {
			this.width = width;
			this.height = height;
	}
	public Triangle() {
	}
	
	// getter, setter 메소드를 재정의
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// toString() 메소드를 재정의
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	// 메소드 구현
	@Override
	double area() {
		// 가로 * 세로 / 2;
		return width * height /2;
	}
	@Override
	double round() {
		// 정삼각형 : 한변의 길이 * 3
		return width * 3;
	}
}