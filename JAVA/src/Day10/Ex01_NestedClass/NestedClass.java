package Day10.Ex01_NestedClass;

public class NestedClass {
	public static void main(String[] args) {
		// 아우처 클래스인 A 객체 생성
		A a= new A();
		a.a=10;
		a.b=20;
		System.out.println("A의 a : "+a.a);
		System.out.println("A의 b : "+a.a);
		a.aMethod();
		
		// 이너 클래스인 B 객체 생성
		A.B b= a.new B();
		b.x=10;
		b.y=20;
		System.out.println("B의 x : "+b.x);
		System.out.println("B의 y : "+b.y);
		b.bMethod();
	}
}