package Day12.Ex01_Object;

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=]"+x+", y="+y+"]";
	}
}

// clone() 메소드를 사용하려면 clonable 인터페이스를 구현해야함
class Circle implements Cloneable{
	Point point;	// 중심점
	int radius;		// 반지름
	
	public Circle(int radius, int x, int y) {
		this.point = new Point(x, y);
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	// clone 메소드 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 5);
		Circle copyCircle = (Circle) circle.clone();	// 인스턴스 복제
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		// clone 메소드로 객체를 복제하면, 같은 객체 정보를 가지는 새로운 인스턴스를 생성
		if( circle.equals(copyCircle) ) {
			System.out.println("circle 과 copyCircle 은 같은 객체입니다.");
		}
		
		// System.identityHashCode(객체)  : 객체의 해시코드를 반환
		System.out.println( System.identityHashCode(circle) );
		System.out.println( System.identityHashCode(copyCircle) );
	}
}