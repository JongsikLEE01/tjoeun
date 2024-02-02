package Day03;

import java.util.Scanner;

public class Ex02_IfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
				
		//입력 값이 홀수인지 짝수인지 판단
		if(num % 2 == 1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다");
		}
		sc.close();
	}
}