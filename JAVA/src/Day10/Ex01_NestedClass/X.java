package Day10.Ex01_NestedClass;
// 중첩클래스

public class X {
	// 인스턴스 이너 클래스
	// 인스턴스 이너 클래스 안에서 static 멤버는 사용 불가
	class Y{
		int value;
		// 에러 static int value2;
		Y(){
			System.out.println("X의 Y 객체 생성자");
		}
		void method1() {
			System.out.println("Y의 메소드");
		}
	}
	
	// static 이너 클래스
	// static 이너 클래스에서는 static 멤버 사용 가능
	static class Z{
		int value1;
		static int value2;
		Z(){
			System.out.println("X의 Z 객체 생성");
		}
		void method1() {
			System.out.println("Z의 메소드");
		}
		static void method2() {
			System.out.println("Z의 static 메소드");
		}
	}
	
	// 로컬 클래스
	// 메서드 안에 정의하 클래스, 메소드가 실행 될때만 사용
	void method() {
		class L{
			int vlaue1;
			// static int value2;	에러 발생
			L(){
				System.out.println("L 객체 생성");
			}
			void method1() {
				System.out.println("L의 메소드");
			}
			/*
			static void method2() {		에러 발생
				System.out.println("L의 static 메소드");
			}
			*/
		}
		
		L l = new L();
		l.vlaue1 = 10;
		System.out.println("로컬 클래스 L의 변수 - "+l.vlaue1);
		l.method1();
	}
}