package Day02;

import java.util.Scanner;

public class Ex08_Circle {
	public static void main(String[] args) {
		// 상수 : 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// 상수 선언시 반드시 값을 초기화해야 하고 변경시 에러 발생
		// 상수 키워드 : final
		final double PI = 3.141592;
		// 에러 발생 PI = 3.14;
		Scanner sc = new Scanner(System.in);
		// 원의 넓이 (넓이 = 원주율(π) = 반지름(r)^2)
		System.out.print("반지름 : ");
		double radius =  sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이 : " + area);
		sc.close();
	}
}