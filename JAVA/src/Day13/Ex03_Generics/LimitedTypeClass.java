package Day13.Ex03_Generics;

class X {  }

class A extends X{	} 	// X를 상속한 A클래스

class B extends A{  } 	// A를 상속한 D클래스
class C extends A{  } 	// A를 상속한 C클래스

class D<T extends A>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

// 1) integer 클래스로만 타입 매개변수로 사용가능하도록 제한
// 2) Number 클래스로 제한(Double, Integer 등 숫자 타입 클래스만 사용가능하도록 제한)
class E<T extends Number>{
	T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class LimitedTypeClass {
	public static void main(String[] args) {
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		// 에러메세지
		//Bound mismatch: The type X is not a valid substitute for the bounded parameter <T extends A> of the type D<T>
		// D클래스는 타입 매개변수로 a클래스를 제한하고 있기 때문에,
		// X클래스는 타입 매개변수로 사용 불가
		// A,B,C 클래스는 타입 매개 변수로 사용 가능
		// D<X> d4 = new D<X>();
		
		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());
		
		// A는 B와C의 부모 객체 이므로 자식 객체를 생성 가능
		d1.setT(new B());
		d1.setT(new C());
		
		// B와 C는 부모 객체인 A를 대입 불가(다운캐스팅 필요)
		// d2.setT(new A());
		// d3.setT(new A());
		
		// 타입 지정을 생략, 제네릭 타입을 제한한 A클래스를 기본으로 생성
		D d5 =new D();		// D<A> d5 =new D<A>();	 ->  기본타입인 A를 사용
		d5.setT(new A());
		d5.setT(new B());
		d5.setT(new C());
		
		// Wrapper
		// Integer, double 등 숫자타입으로 한정해서 변수를 사용하고 싶을 경우 Number, 즉 상위 클래스로 올라가 특정해서 사용
		// D<Number>
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		// (에러 : 숫자타입 아님) E<Boolean> e4 = new E<Boolean>();
		
		e1.setT(100);
		System.out.println(e1.getT());
		e2.setT(10.34);
		System.out.println(e2.getT());
		e3.setT((byte)127);  // 기본 숫자만 입력시 int타입으로 인식, byte로 강제형변환 필요 
		System.out.println(e3.getT());
	}
}