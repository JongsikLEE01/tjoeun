package Day11.Ex05_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			input();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.err.println("정수를 입력하세요");
		}
		
		sc.close();
	}
	
	// 예외 전가 - throws
	// 예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것
	public static void input() throws InputMismatchException {
		System.out.println("입력 :");
		int input = sc.nextInt();	// 예외 발생 가능성 코드
		System.out.println(input);
	}
}