package Day11.Ex01_Exception;

import java.util.Scanner;

// 예외처리 - ArithmeticException ->  산술 연산 예외(어떤 수를 0으로 나누는 수학적 정의 불가)
public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("a: ");
		a=sc.nextInt();
		
		System.out.println("b : ");
		b = sc.nextInt();
		
		// 예외 메세지 : Exception in thread "main" java.lang.ArithmeticException: / by zero
		// 예외 처리 	: try ~catch
		try {
			// 예외 발생 가능성이 있는 문장
			System.out.println("a / b : "+(a/b));			
		}
		// catch(예외 타입 객체){}
		// Exception : 최상위 예외 클래스
		catch (ArithmeticException ae) {
			// 예외 발생 시 실행할 예외 처리 문장
			System.err.println("0으로 나누는 연산을 수학적으로 정외되지 않습니다.");
		}
		// finally 블록 생략 가능
		finally {
			// 예외 처리와 무관하게 실행하는 문장
			// 주로 예외처리와 관련 문장을 작성(자원 해제 등)
			System.out.println("메모리 해제...");
			sc.close();
		}
		System.out.println("프로그램 종료...");
	}
}