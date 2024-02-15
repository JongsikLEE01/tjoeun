package Day10.Ex02_NestedInterface;

public class I {
	// 인터페이스 선언
	J j;
	public void setInterface(J j) {
		this.j = j;
	}
	
	// 중첩 인터페이스 선언
	static interface J{ // I클래스 안에 J인터페이스가 종속적으로 정의
		void methodA();
		void methodB();
	}
	
	void method() {
		j.methodA();
		j.methodB();
	}
}