package Day17.Ex01_Lambda;
/*
 * 익명 객체
 * - 익명 자식 객체
 * - 익명 구현 객체
 * 
 * 익명 함수
 * 
 * * 익명 자식 객체 vs 익명 구현 객체 vs 익명 함수
 */
// 익명 자식 객체의 부모 클래스 정의
class Television{
	void volumnUp() {System.out.println("UP"); }
	void volumnDown() {System.out.println("Down"); }
	
}

// 익명 구현객체 인터페이스 정의
interface RemoteControl{
	void volumnUp();
	void volumnDown();
}

// 함수형 인터페이스 정의
@FunctionalInterface		// 인터페이스가 함수형 인터페이스라는것을 명시(추상메소드가 2개 이사잉면 에러)
interface Calculator{
	int calc(int a, int b);
}

public class LambdaTest {
	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {
			@Override
			void volumnUp() { System.out.println("up - 구현"); }
			@Override
			void volumnDown() { System.out.println("down - 구현"); }
		};
		tv.volumnUp();
		tv.volumnDown();
		
		// 익명 구현 객체
		RemoteControl rc =  new RemoteControl() {
			@Override
			public void volumnUp() { System.out.println("up - 구현"); }
			@Override
			public void volumnDown() { System.out.println("down - 구현"); }
		};
		rc.volumnUp();
		rc.volumnDown();
		
		// 익명 구현 객체2
		Calculator cal = new Calculator() {
			@Override
			public int calc(int a, int b) { return a+b; }
		};
		int res1 = cal.calc(10, 20);
		System.out.println("rse1 : "+res1);
		
		// 람다식
		Calculator calcLambda = (a,b) -> {return a+b;};
		int res2 = calcLambda.calc(3, 4);
		System.out.println("rse2 : "+res2);
	}
}