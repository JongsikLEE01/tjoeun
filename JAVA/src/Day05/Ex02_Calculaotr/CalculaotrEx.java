package Day05.Ex02_Calculaotr;

import java.util.Scanner;

public class CalculaotrEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%1.2f \n", 1000.000);
		
		Calculaotr cal = new Calculaotr();
		double d[] = {50,80,70,55};
		System.out.println("50,80,70,55의 합계 : "+ Math.round(cal.sum(d)));
		System.out.println("50,80,70,55의 평균 : "+cal.avg(d));
		
		System.out.print("연산을 할 숫자 두개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("어떤 연산을 할까요?");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");
		System.out.println("그 외 숫자는 종료");
		System.out.print("입력 >> ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: // 덧셈 메소드 호출
			System.out.println(a+" + "+b+" = "+ cal.plus(a, b));
			break;
		case 2: // 뺄셈 메소드 호출
			System.out.println(a+" - "+b+" = "+ cal.minus(a, b));
			break;
		case 3 : // 곱셈 메소드 호출
			System.out.println(a+" * "+b+" = "+ cal.multiple(a, b));
			break;
		case 4 : // 나눗셈 메소드 호출
			System.out.println(a+" / "+b+" = "+ cal.divide(a, b));
			break;
		case 5 : // 나머지 메소드 호출
			System.out.println(a+" % "+b+" = "+ cal.remain(a, b));
			break;
		default:
			System.out.println("종료");
			break;
		}
		sc.close();
	}
}