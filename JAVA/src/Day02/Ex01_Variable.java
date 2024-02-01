package Day02;

public class Ex01_Variable {
	public static void main(String[] args) {
		// 변수 선언 : 자료형 변수명;
		// 변수 선언 및 초기화 : 자료형 변수명 = 값;
		// 정수 데이터 : int
		
		int x;  // int형 변수 x 선언
		int y;
		int a, b; // int형 여러 변수 a,b 동시에 선언
		
		int i = 10; // int형 변수 i 선언 및 초기화
		int j = 20;
		int m = 30, n = 40; // int형 여러 변수 m,n 선언 및 초기화
	
		x = 100; // =(대입연산자)를 통해 int형 변수 x를 초기화
		y = 200;
		
		// x + y : x, y 는 피연산자 +는 연산자
		System.out.println("x = " +x);
		System.out.println("y = "+y);
		System.out.println("x + y = "+ (x+y)); // "x + y = "부분이 문자열로 처리, x와 y로 문자열로 처리돼 100,200으로 처리 소괄호로 묶어 x+y를 우선처리
		System.out.println("x + y / 2 = "+ ((x + y) / 2)); 	// 사칙 연산 우선순위 *,/ : 1순위	+,- : 2순위	알맞게 ()기호를 사용
	}
}