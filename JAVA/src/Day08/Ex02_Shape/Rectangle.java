package Day08.Ex02_Shape;
//shape 클래스 구현 (추상 클래스의 추상 메소드는 반드시 오버라이딩을 해여함)
public class Rectangle extends Shape {
	// 가로 높이 길이를 저장할 변수 선언
	double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
	}
	
	// 메소드 정의
	@Override
	double area() {
		// 가로 * 세로
		return width * height;
	}
	@Override
	double round() {
		// (가로)+(세로)*2
		return (width * height)*2;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	// getter, setter
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
}