package Day07.Review;

import java.util.Scanner;

public class Ex01_Multiple {
	// 프로그램의 시작
	public static void main(String[] args) {
		// 정수 하나를 입력받아 3의 배수인지 출력
		// 3의 배수일 경우 3의 배수입니다. 아닐경우 아닙니다라고 출력
		// 1. 정수입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 2. 3의 배수인지 판단 및 출력
		if(num%3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	}
}